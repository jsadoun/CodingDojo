from flask import Flask, render_template, session, redirect

app = Flask(__name__)
app.secret_key = "thisissecret"

@app.route("/")
def index():
    if "counter" not in session:
        session["counter"] = 1
    else:
        session["counter"] += 1
    return render_template("index.html")

@app.route("/add2")
def add2():
    session["counter"] += 1
    return redirect("/")

@app.route("/reset")
def reset():
    session["counter"] = 0
    # session.clear()
    return redirect("/")

app.run(debug=True)
