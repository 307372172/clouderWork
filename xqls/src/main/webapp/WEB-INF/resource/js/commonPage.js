function getTableData(id,url,colums,param) {
    var oTable1 = $('#'+id).dataTable( {
        "bAutoWidth":false,
        "sAjaxSource":url,
        "iDisplayLength" : 10,// 每页显示行数
        "bSort" : false,// 排序
        "bProcessing" : true,
        "bServerSide" : true,
        "bDestroy" : true,
        "aoColumns":colums,
        "fnServerData": retrieveData, // 获取数据的处理函数
        "fnServerParams": function ( aoData ) {
            if(param){
                aoData.push( { "name": "params", "value": param } );
            }
        }
    });
    return oTable1;
}

function retrieveData( sSource111,aoData111, fnCallback111) {
    $.ajax({
        url : sSource111,//这个就是请求地址对应sAjaxSource
        data :aoData111,//这个是把datatable的一些基本数据传给后台,比如起始位置,每页显示的行数
        type : 'post',
        dataType : 'json',
        async : false,
        success : function(result) {
           if(result.isSuccess){
               fnCallback111(result.data);//把返回的数据传给这个方法就可以了,datatable会自动绑定数据的
           }else{
               bootBoxAlert(result.resultMsg)
           }

        },
        error : function(msg) {
            bootBoxAlert(msg)
        }
    });
}




function deleteCommon(checkBoxName,url,funcName) {
    var users=  $("input[name='"+checkBoxName+"']:checked");
    if(!users||users.length==0){
           bootBoxAlert("请选择要删除的记录");
        return false;
    }
    var checked = [];
    $("input[name='"+checkBoxName+"']:checked").each(function() {
        checked.push($(this).val());
    });
    $.ajax({
        type: "post",
        headers : {
            'Accept' : 'application/json',
            'Content-Type' : 'application/json'
        },
        url: url, data:JSON.stringify(checked), success: function (data) {
            if(data.isSuccess){
                   bootBoxAlert("删除成功");
                if(funcName&&funcName!=''){
                    eval(funcName+"()");
                }
            }
        }, error: function () {
               bootBoxAlert("删除异常");
        }
    });


}

