from flask import Flask, render_template, request, redirect
app = Flask(__name__)

@app.route('/')
def index():
    return render_template('index.html')

@app.route('/ninjas')
def ninjas():
    return render_template('ninjas.html')

@app.route('/blue')
def Leo():
    return render_template('blue.html')

@app.route('/orange')
def Michael():
    return render_template('orange.html')

@app.route('/red')
def Raph():
    return render_template('red.html')

@app.route('/purple')
def Don():
    return render_template('purple.html')

@app.route('/other')
def Other():
    return render_template('other.html')

app.run(debug=True)

