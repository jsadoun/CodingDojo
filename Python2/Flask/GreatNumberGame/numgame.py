from flask import Flask, render_template, redirect, request, session
import random 

app = Flask(__name__)
app.secret_key ="godwin"


@app.route('/')
def guessnumber():
    if 'computerNumber' not in session:
        session['computerNumber'] = random.randrange(0,101)
        
    return render_template("index.html")


@app.route('/2', methods=["POST"])
def reset():
    session.clear()
    return redirect('/')


    
@app.route('/guessnumber', methods=['POST'])
def guessing():
    if 'computerNumber' not in session:
        session['computerNumber'] = random.randrange(0,101)
        
#    changing unicode to an int
    userNum = int(request.form['guess'] ) 
    session['userNum'] = userNum
    x = session['computerNumber']

    print userNum, "user_guess"
    print x, "_random_num"
    if userNum == x:
        print "match"
    elif userNum > x:
        print "too high"
    elif userNum < x:
        print "too low"
    else:
        print "invalid"
    return redirect('/')

# @app.route('/playagain')
# def playagain
    
app.run(debug=True)