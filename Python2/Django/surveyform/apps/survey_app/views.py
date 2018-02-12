from django.shortcuts import render, redirect

# Create your views here.
def index(request):
    return render(request, "survey_app/index.html")

def submit(request):
    if 'count' not in request.session:
        request.session['count'] = 0
    else:
        request.session['count'] += 1
    request.session['count']
    request.session['username'] = request.POST['username']
    request.session['location'] = request.POST['location']
    request.session['language'] = request.POST['language']
    request.session['comments'] = request.POST['comments']
    print request.session['count']
    print request.session['username']
    print request.session['location']
    print request.session['language']
    print request.session['comments']
    return redirect("/results")

def results(request):
    return render(request, "survey_app/results.html")