var intervalo;

function tempo2() {
	var s = 1;
	var m = 0;

	intervalo = window.setInterval(function() {
		if (s == 60) { m++; s = 0; }
		if (m == 60) {s = 0; m = 0; }		
		s++;
		
		//final dos alongamentos
		if(s == 50) {			
			window.open('clockBar.html');
		}
				
	},1000);
}

function carousel() {
	var interval;
	
	$(document).ready(function(){
	      $("#myCarousel").carousel({
	      interval : 1000,	      
	       });	      
	      });
}


