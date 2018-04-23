$(document).ready(function(){
    $("#_click").click(function(){
        alert("The button was clicked.");
    });
});

//.hide button
$(document).ready(function(){
    $("#_hide").click(function(){
        $("button#_hide").hide();
    });
});

// .show button
$(document).ready(function(){
	// start the txt hidden
	$("#_hiddentxt").hide();
	// on click, show the hidden txt
    $("#_show").click(function(){
        $("#_hiddentxt").show();
        $("#_show").hide();
    });
});

$(document).ready(function(){
	$("#_peekaboo").hide();
    $("#_toggle").click(function(){
        $("#_peekaboo").toggle();
    });
});

//.slideDown
$(document).ready(function(){
	$("#_downslide").hide(); //hides text
    $("#_slideDown").click(function(){ //click triggers functionality
        $("#_downslide").slideDown(); //slides hidden text down
        $("#_slideDown").hide(); //hides button
    });
});

//.slideUp
$(document).ready(function(){
    $("#_upslideText").hide(); //hides text
    $("#_slideButtonUp").click(function(){ //click triggers functionality
        $("#_slideButtonUp").slideUp(); //slides hidden text up
            $("#_upslideText").show(); //hides button
    });
});

//.slideToggle
$(document).ready(function(){
	$("#_toggleslide").hide(); //hides text
    $("#_slideToggle").click(function(){ //initiates slide down
        $("#_toggleslide").slideToggle("slow"); //slides back up
    });
});

//.fadeIn
$(document).ready(function(){
    $("#_fadeIn").click(function(){ //initializes click
        $("#redbox").fadeIn(3000, function(){ //fades redbox in by 3000milisecs
            $("#hacked").fadeIn(1850, function(){ //fades first messege in by 1850milisecs
                $("#jk").fadeIn(400);  //fades second messege in by 400 milisecs
            });
        });
    });
});

//.fadeOut
$(document).ready(function(){
    $("#_fadeOut").click(function(){ //initializes click
        $( "#_fadeOut" ).fadeOut( "slow" ); //fades button out
    });
});

//.addClass
$(document).ready(function(){
    $("#_addClass").click(function(){
        $("#_addClass").addClass("selected highlight"); //adds css to button
    });
});

//.before
$(document).ready(function(){
    $("#_before").click(function(){
        $( "#_before" ).before( "Inserts developers choice of input (like this description) BEFORE selected element (in this case - the button)" );
    });
});

//.after
$(document).ready(function(){
    $("#_after").click(function(){
        $( "#_after" ).after( "<br>Inserts developers choice of input (like this description) AFTER selected element (in this case - the button)" );
    });
});

//.append
$(document).ready(function(){
    $("#_append").click(function(){
        $( "#_append" ).append( "..or here.." ); //adds "..or here.." into the button
    });
});

//.html
$(document).ready(function(){
    $("#_html").click(function(){
        var switchToHtml = $("#_html").html();
        $( "#_html" ).text(switchToHtml);
    });
});
