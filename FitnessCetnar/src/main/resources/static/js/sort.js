function sortTable(n) {
    var table, rows, switching, i, x, y, shouldSwitch, dir, switchcount = 0;
    table = document.getElementById("responseElement");
    switching = true;
    dir = "asc";
    var thead=document.getElementById("th"+n);
    thead.classList.add('fa-sort-asc');
    while (switching) {
        switching = false;
        rows = table.rows;
        for (i = 1; i < (rows.length - 1); i++) {
            shouldSwitch = false;
            x = rows[i].getElementsByTagName("TD")[n];
            y = rows[i + 1].getElementsByTagName("TD")[n];
            if (dir == "asc") {
                if (x.innerHTML.toLowerCase() > y.innerHTML.toLowerCase()) {
                    shouldSwitch = true;
                    break;
                }
            } else if (dir == "desc") {
                if (x.innerHTML.toLowerCase() < y.innerHTML.toLowerCase()) {
                    shouldSwitch = true;
                    break;
                }
            }
        }
        if (shouldSwitch) {
            rows[i].parentNode.insertBefore(rows[i + 1], rows[i]);
            switching = true;
            switchcount ++;
        } else {
            if (switchcount == 0 && dir == "asc") {
                dir = "desc";
                thead.classList.remove('fa-sort-asc');
                thead.classList.add('fa-sort-desc');
                switching = true;
            }
        }
    }
    for (i = 1; i < 4 ; i++)
    {
        var trows=document.getElementById("th"+i);
        if(i!=n)
        {
            if(trows.classList.contains('fa-sort-asc')){
                trows.classList.remove('fa-sort-asc');
            } else if(trows.classList.contains('fa-sort-desc')){
                trows.classList.remove('fa-sort-desc');
            }
        }
    }
}
