# otwieranie pliku
dane<-read.csv2('X:/S12-32/cw1.csv')

# tworzenie wektoru z drugiej kolumny
x<-dane[,2]

# długość niezbędna do policzenia długości x
n = length(x)

# tworzenie postawowej struktury z funkcjami
ps<-summary(x)

q = quantile(x, c(.25, .5, .75))
# do 'q' przypisane zostaną wszystkie decyle
dec = quantile(x,c(.1, .9))

# odchylenie standardowe
o = sd(x)

# liczenie odchylenia ręcznie
o.p <- (sum(x^2) / n - mean(x)^2)^.5

# współczynnik zmienności
wz = o.p/mean(x)*100
print(wz)

# odchylenie ćwiartkowe i ćwiartkowy współczynnik zmienności
oc = (q[3] - q[1]) / 2
vq = oc / q[2] * 100

g1.p = (sum(x^3)/n - 3*sum(x^2)/n*mean(x)+2*mean(x)^3)/o.p^3
# asymetria układu dodatnia prawostronna, większość czasu wykonania będzie po przeciwnej stronie
# krótszy niż średnia, ramię wyciągnięte w prawą stronę, garb w lewą stronę
# skrajna prawostronna asymetria rozkładu

# wskazniki; kwartylowy i decylowy
AQ = (q[3] + q[1] - 2*q[2]) / (2*oc)
AD = (dec[2] + dec[1] - 2*q[2]) / (dec[2] - dec[1])

# grupowanie danych
grupowanie = hist(x, breaks = c(0:10,15,20,25,50,100,300))


