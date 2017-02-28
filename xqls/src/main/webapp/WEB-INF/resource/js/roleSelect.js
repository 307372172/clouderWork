
/**
 * 根据字段编号获取该字段对应的角色
 * @param selectId
 * @param rolesId
 */
function getRoleSelectFunBack(selectId,func,rolesId) {
    var paramStr="";
    if(rolesId){
        paramStr="?roleIds="+rolesId;
    }
    $.get("../../../autoForm/autoFormSelect.html"+paramStr,function(data){ //初始將a.html include div#iframe
        $("#"+selectId).html(data);
        if(func){
            eval(func+"()");
        }
    });
}