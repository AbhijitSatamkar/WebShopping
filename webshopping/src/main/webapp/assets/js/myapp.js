$(function() {
	// activate the current page
	switch (menu) {
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
		// if(menu == 'home'){ break;}
		$('#products').addClass('active');
		$('#a_' + menu).addClass('active');
		break;
	}

	// data for the product using jquery dataTable
	var $table = $('#productListTable');

	var jsonUrl = ' ';
	if (window.categoryId == ' ') 
	{
		jsonUrl = window.contextRoot + '/json/data/all/products';
		console.log("empty"+jsonUrl);
	} 
	else 
	{
		jsonUrl = window.contextRoot + '/json/data/category/'+ window.categoryId + '/products';
		console.log(jsonUrl);
	}
	
	if ($table.length) {
		$table.DataTable({
			lengthMenu : [ [ 2, 5, 10, -1 ], [ '2', '5', '10', 'ALL' ] ],
			pageLength : 5,
			ajax : {
						url : jsonUrl,
						dataSrc : ''
					},
			columns : [
					    {
					    		data: 'code',
					    		mRender:function(data,type,row){
					    			return '<img src="'+window.contextRoot+'/resources/images/'+data+'.jpg" class="dataTableImg"/>'
					    		}
					    },
						{
							data : 'name'
						}, 
						{
							data : 'brand'
						}, 
						{
							data : 'unitPrice',
							mRender: function(data,type,row){
								return '&#8377 ' + data;
							}
						}, 
						{
							data : 'quantity'
						},
						{
							data : 'id',
							bSortable:false,
							mRender: function(data,type,row){
								var str = '';
								str += '<a href="' + window.contextRoot + '/show/'+data+'/product" class="btn btn-primary"><span class="icon-eye-open"><\span></a> &#160;';
								str += '<a href="' + window.contextRoot + '/cart/add/'+data+'/product" class="btn btn-success"><span class="glyphicon-shopping-cart"><\span></a>';
								return str;
							}
						}	
						
					 ]
		});
	}

});
