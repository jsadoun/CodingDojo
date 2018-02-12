from django.shortcuts import render

# Create your views here.
def index(request):
    return render(request, "demo_app/index.html")

def search(request):
   context = {"authors": Author.objects.all()}
   return render(request, "books/index.html")