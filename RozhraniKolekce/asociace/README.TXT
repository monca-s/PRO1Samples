UK�ZKA SYMETRICK� ASOCIACE 1:1
-------------------------------------
T��da Kancel�� odkazuje na sv�ho Spr�vce a Spr�vce obsahuje
referenci na instanci Kancel��e, kterou m� ve spr�v�.

POSTUP:
----------------------
1. Vytvo�te si instanci kancel��e pomoc� konstruktoru bez parametr�.
2. Vyzkou�ejte, jak ob� asociace funguj� (Kancelar->Spravce, Spravce->Kancelar).
3. Vytvo�te si instanci Spr�vce pomoc� dvou parametrov�ho konstruktoru
4. Vytvo�te instanci Kancel��e pomoc� �ty� parametrov�ho konstruktoru. Jako
   jeho posledn� parametr uve�te referenci na Spr�vce vytvo�en�ho v kroku 3
5. M�me hotovou asociaci Kancel��->Spr�vce. Nastavte pomoc� setru opa�nou asociaci -
   tedy Spr�vce mus� odkazovat na svoji kancel��
6. Upravte konstruktor pou�it� v kroku 3 tak, aby nebylo nap��t� ji� nutn� 
   prov�d�t krok 5 samostatn�. Inspirujte se v konstruktoru Kancel��e bez parametr�
   
Zkuste si v��e uveden� kroky prov�st i pomoc� p��kazov�ho panelu (Ctrl + P)