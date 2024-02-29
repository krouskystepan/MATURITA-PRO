/*
Zadani:
Vytvořte aplikaci, ve které bude input pro vložení textu a tlačítko. Po stisknutí tlačítka se napsaný text vloží na stránku. Projekt exportujte do spustitelného souboru.
- Musite si to buildnout sami (ja to na macu pro win nebudu delat)
    - npm run make
*/

const button = document.getElementById('button');
const input = document.getElementById('input');
const text = document.getElementById('text');

button.onclick = () => {
    text.innerText = input.value;
}