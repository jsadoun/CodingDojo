from django.shortcuts import render, redirect
from django.utils.crypto import get_random_string

# Create your views here.
def index(request):
    return render(request, "wordGen_app/index.html")

def create(request):
    if 'count' not in request.session:
        request.session['count'] = 1
    else:
        request.session['count'] += 1

    newWord = get_random_string(length=14)
    request.session['number'] = newWord

    return redirect("/")

def reset(request):
    request.session.clear()
    return redirect("/")


