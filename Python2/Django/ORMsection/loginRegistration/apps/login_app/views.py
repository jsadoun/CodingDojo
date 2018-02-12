from django.shortcuts import render, redirect 
from .models import User
from django.contrib import messages

# Create your views here.
def index(request):
    print(User.objects.all())
    return render(request, "login_app/index.html")

def register(request):
    response = User.objects.register(
        firstName = request.POST["firstName"],
        lastName = request.POST["lastName"],
        email = request.POST["email"],
        password = request.POST["password"],
        confirm_pass = request.POST["confirm_pass"],
        ) 
    if response["valid"]:
        messages.add_message(request, messages.SUCCESS, "Welcome to the site!")
    else:
        for error_message in response["errors"]:
            messages.add_message(request, messages.ERROR, error_message)


    return redirect("/")

def login(request):
    response = User.objects.login(
        email = request.POST["email"],
        password = request.POST["password"],
        )      
    if response["valid"]:
        messages.add_message(request, messages.SUCCESS, "Welcome to the site!")
    else:
        for error_message in response["errors"]:
            messages.add_message(request, messages.ERROR, error_message)

    return redirect("/")