function loadJSON(callback) {

    var xobj = new XMLHttpRequest();
    xobj.overrideMimeType("application/json");
    xobj.open('GET', 'NameCode.json', false); // Replace 'my_data' with the path to your file
    xobj.onreadystatechange = function () {
        if (xobj.readyState == 4 && xobj.status == "200") {
            // Required use of an anonymous callback as .open will NOT return a value but simply returns undefined in asynchronous mode
            callback(xobj.responseText);
        }
    };
    xobj.send(null);
}
function init() {
    loadJSON(function (response) {
        // Parse JSON string into object
        var actual_JSON = JSON.parse(response);
    });
}
function foobar() {
    var json;
    loadJSON("NameCode.json", function (response) {
        json = JSON.parse(response);
        console.log(json[0].name); // Successfully shows the result
    });
    console.dir(json[0].name); // TypeError: json is undefined
}

