grammar Schedule;
schedule: 'Schedule {'+jadwal+'}';
jadwal: hari+':'+jam'->'+ruangan+'('+konfigurasi+'),'+matkul+'('+konfigurasi+')'+preforw;
hari: ALPHA;
jam: NUM;
ruangan: ALPHANUM;
konfigurasi: '('+kapasitas+','+fasilitas')';
matkul: ALPHANUM;
preforw: ALPHA;
kapasitas: NUM;
fasilitas: ALPHA;
ALPHA: [a-zA-Z]+;
ALPHANUM: [a-zA-Z0-9]+;
NUM: [0-9]+;
WS: [ \t\r\n]+ -> skip;