from django.shortcuts import render, HttpResponse

# Create your views here.
def index(request):
    response = "hello"
    print response
    return HttpResponse(response)

def new(request):
    response = "placeholder to display a new form to create a new blog"
    print response
    return HttpResponse(response)

def create(request):
    return redirect("/")

def show(request, number):
    response = "placeholder to display blog number"
    print response 
    return HttpResponse(response)

def edit(request, number):
    response = "placerholder to edit blog ", number
    print response
    return HttpResponse(response)

def destroy(request, number):
    return redirect("/")




