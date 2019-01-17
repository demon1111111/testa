# !/usr/bin/python 
# -*- coding:utf-8 -*-  

from threading import Timer
import datetime
import pymysql
import csv
import codecs
import sys
import urllib2

reload(sys) 
sys.setdefaultencoding('utf8')

def download():
    print "downloading online-valid..."
    url="http://data.phishtank.com/data/6c2060df25ca6b244e83976615edee1b274b16cafc561bde1514f72b87d4438e6/online-valid.csv"
    f = urllib2.urlopen(url) 
    data = f.read() 
    print "ok!"
    with open("verified_online.csv", "wb") as code: 
        code.write(data)
    code.close()


def get_conn():
    conn = pymysql.connect(host='localhost', port=3306, user='scorpion', passwd='CM$ecThreat#2015', db='phish', charset='utf8')
    return conn
	
#删除数据	
def delete():
    conn = get_conn()
    cur = conn.cursor()
    sql = "DELETE FROM verified"
    try:
        cur.execute(sql)
        conn.commit()
    except:
        conn.rollback()
	conn.close()

#添加数据	
def insert(cur, sql, args):
    cur.execute(sql, args)

#解析csv
def read_csv_to_mysql(filename):
    with codecs.open(filename=filename, mode='r', encoding='utf-8') as f:
        reader = csv.reader(f)
        head = next(reader)
        conn = get_conn()
        cur = conn.cursor()
        sql = 'insert into verified values(%s,%s,%s,%s,%s,%s,%s,%s)'
        for item in reader:
            if item[1] is None or item[1] == '':  # item[1]作为唯一键，不能为null
                continue
            args = tuple(item)
            print(args)
            insert(cur, sql=sql, args=args)

        conn.commit()
        cur.close()
        conn.close()


 # 每小时执行一次任务
def printHello():
    print('TimeNow:%s' % (datetime.datetime.now().strftime('%Y-%m-%d %H:%M:%S')))
    t = Timer(2, printHello)
    t.start()

if __name__ == "__main__":
    printHello()
