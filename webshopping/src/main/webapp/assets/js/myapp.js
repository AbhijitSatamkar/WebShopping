$(function(){
	switch(menu){
		case 'Home':
			 $('#home').addClass('active');
			 break;
		case 'About':
			$('#about').addClass('active');
			break;
		case 'Contact':
			$('#contact').addClass('active');
			break;
		case 'Products':
			$('#products').addClass('active');
			break;
		default:
//			if(menu == 'home'){ break;}
			$('#products').addClass('active');
		    $('#a_'+menu).addClass('active');
			break;
	}
});