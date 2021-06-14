
window.onload = function () {
    function deleteProduct() {
        console.log("123");
        var pid = document.getElementById("pid").value;
        console.log("123");
        console.log(pid);
        jQuery.ajax({
            url: "/BugerKingW/ProductManager",
            type: "GET",
            data: {pid: pid,
                service: "delete"},
            success: function (result) {
                console.log(result);
                $("#row").html(result);
            }, error: function () {
                $("#row").html("");
            }

        });
    }
};
    function deleteP() {
        console.log("123");
}


