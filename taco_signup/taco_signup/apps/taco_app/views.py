from django.shortcuts import render, redirect

# Create your views here.
def index(request):
    if 'tacos' not in request.session:
        request.session['tacos'] = {
            "carne": 0,
            "carnita": 0
        }
    print("Hello")
    print( request.session['tacos'])
    # if 'amount' not in request.session:
    #     request.session['amount'] = 0

    return render(request, "taco_app/index.html")

def process(request, tacotype):
    if tacotype == "carne":
        request.session['carne']+=1
    elif tacotype == "carnita":
        request.session['tacos']+=1
    elif tacotype == "chorizo":
        request.session['tacos']+=1
    elif tacotype == "birria":
        request.session['tacos']+=1
    elif tacotype == "lengua":
        request.session['tacos']+=1
    elif tacotype == "pastor":
        request.session['tacos']+=1
    elif tacotype == "tripa":
        request.session['tacos']+=1
    elif tacotype == "tinga":
        request.session['tacos']+=1
    elif tacotype == "barb":
        request.session['tacos']+=1
    elif tacotype == "chich":
        request.session['tacos']+=1

    # request.session['tacos']+=tacos
    # request.session['amount']=taco
    return redirect('/')