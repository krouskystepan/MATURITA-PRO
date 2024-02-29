/*
Zadani - Neni, ale je dobry vedet, jak se to dela ten canvas :-)
*/
// Vezmeme si id z html
const c = document.getElementById("canvas");
// Nastavime si 2d
const ctx = c.getContext("2d");

// Jaka barva (cerna je default)
ctx.strokeStyle = "red";

// Jak tluste (1 je default)
ctx.lineWidth = 2.5;

// Zacatek jednotlive "cesty"
ctx.beginPath();
// Presunume stetec na pozici 1.
ctx.moveTo(0, 0);
// Presunume stetec na pozici 2.
ctx.lineTo(300, 150);
// Vykreslime
ctx.stroke();

// Udelame druhou caru stejnym zpusobem
ctx.beginPath();
ctx.moveTo(0, 150);
ctx.lineTo(300, 0);
ctx.stroke();