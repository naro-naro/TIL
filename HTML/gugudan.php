<?php
echo "<h1>구구단 표</h1>";

echo "<table border=1><tr align = 'center'>";

for($dan=2; $dan<=9; $dan=$dan+1){
    echo "<td>$dan단</td>";
}

echo "</tr>";

for($i=1; $i<=9; $i=$i+1){
    echo "<tr align='center'>";
    
    for($j=1; $j<=9; $j=$j+1){
        $k=$i*$j;
        echo "<td>$j X $i = $k</td>"
    }
    echo "</tr>"
}
echo "</table>"
?>