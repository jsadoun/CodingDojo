from django.shortcuts import render, redirect
from .models import courses
from django.contrib import messages
from models import *

# Create your views here.
def index(request):
    allCourses = courses.objects.all()
    data = {
        'allCourses': allCourses
    }
    return render(request, "course_app/index.html", data)

def add(request):
    response = courses.objects.addCourse(
        name=request.POST["name"],
        desc=request.POST["desc"]
    )
    if response["valid"]:
        messages.add_message(request, messages.SUCCESS, "New course has been added!")    
        return redirect('/')
    else:
        for error_message in response["errors"]:
            messages.add_message(request, messages.ERROR, error_message)
            print("We got an error here buddy")
        return redirect("/")


def remove(request, course_id):
    this_course = courses.objects.get(id=course_id)
    data = {
        'this_course': this_course
    }
    return render(request, "course_app/delete.html", data)

def confirm_remove(request, course_id):
    the_course = courses.objects.get(id=course_id)
    the_course.delete()
    data = {
        'the_course': the_course
    }
    return redirect('/', data)

def remove_ok(request):
    return redirect('/')