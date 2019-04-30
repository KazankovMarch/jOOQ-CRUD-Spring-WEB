


function deleteAuthor(id) {
    var xhr = new XMLHttpRequest();
    xhr.open("DELETE","/author/"+id);
    xhr.onreadystatechange = function () {
        if (xhr.readyState === 4) {
            if(xhr.status === 200){

            }
        }
    };
    xhr.send(null);
}