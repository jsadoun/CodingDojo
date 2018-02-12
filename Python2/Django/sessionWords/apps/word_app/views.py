from django.shortcuts import render, redirect

# Create your views here.
def index(request):
    if "new_word" not in request.session:
        request.session['new_word'] = []
    return render(request, "word_app/index.html")

def process(request):
    word = {
        "word": request.POST['new_word'],
        "color": request.POST['color'],
    }
    if "color" not in request.POST:
        word["color"] = 
    if "fontsize" not in request.POST:
        word["fontsize"] = "small"
    else:
        word["fontsize"] = request.POST["fontsize"]
        
    print word
    request.session['word'] = request.session['new_word'].append(word)
    print (request.POST['new_word'])
    print (request.POST['color'])
    print (request.POST['fontsize'])
    return redirect('/')