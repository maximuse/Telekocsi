A feladat során egy telekocsi szolgáltatást végző cég hirdetőinek és utasainak párosítását kell elvégeznie. A hirdetők egy adott útvonalon (induló- és célállomás) vállalják, hogy az autójukban a szabad férőhely erejéig utasokat visznek el.

A feladat megoldása során két UTF-8 kódolású fájllal kell dolgoznia: autok.csv és igenyek.csv. Mindkét fájl első sora fejléc adatokat tartalmaz.

Az autok.csv fájl minden sora egy-egy hirdető adatát tartalmazza pontosvesszővel elválasztva. Az adatok egymás után: indulóváros, célváros. Ezeket követi a rendszám és a sofőr telefonszáma. A sorban az utolsó adat a férőhelyek száma.

Az igenyek.csv fájl minden sora egy-egy felhasználói igényt tartalmaz. Az adatok egymás után – ahogy a fejlécben is látszik – az igénylő azonosítója, az induló- és célállomás, valamint az utasok száma.

A megoldás során vegye figyelembe a következőket:

• Az ékezetmentes kiírás is elfogadott.

• A feladat jobb megértése érdekében tanulmányozza a mintákat is!

Készítsen konzolos vagy grafikus programot Telekocsi néven, amely az alábbi feladatokat oldja meg!

1. Olvassa be és tárolja el az autok.csv fájl tartalmát!
2. Írja ki, hogy hány hirdető adatát tartalmazta az első feladatban beolvasott fájl!
3. Határozza meg és írja ki a képernyőre, hogy Budapestről Miskolcra összesen hány férőhelyet hirdettek a sofőrök!
4. Határozza meg és írja ki, hogy melyik volt az az útvonal (induló- és célállomás), amelyhez a legtöbb férőhelyet ajánlották fel a hirdetők!
5. Az igenyek.csv fájl beérkezési sorrendben tartalmazza az utazási igényeket. Az igények feldolgozása beérkezési sorrendben történik. Olvassa be az igényeket és a beérkezési sorrendnek megfelelően határozza meg, hogy melyek azok az igények, amelyekhez lehet hirdetést (sofőrt) találni! A találatokat a mintának megfelelően írja ki a képernyőre!
6. Készítse el a minta szerint az utasuzenetek.txt fájlt, amely tartalmazza az egyes igényekre adott választ! Az igénylő sikeres párosítás esetén megkapja az autó rendszámát és a sofőr telefonszámát, sikertelen párosítás esetén egy „Sajnos nem sikerült autót találni” üzenetet kap.
