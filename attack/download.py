# !/usr/bin/env python
# -*- coding:utf-8 -*-  
import requests
url="http://www.wangjie.org/icons/gif/download/gif-078/gif.rar"
path="gif.rar"
r=requests.get(url)
print "ok"
with open(path,"wb") as f:
	f.write(r.content)
f.close()