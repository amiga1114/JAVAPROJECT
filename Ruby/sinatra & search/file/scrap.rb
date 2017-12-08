require 'httparty'
require 'nokogiri'

# HTTParty.get 원하는 정보가 있는 주소로 요청 보냄
# Nokogiri::HTML() 해당 문서를 검색하기 쉽게 바꾸고,
# .css('selector 경로') 원하는 정보만 뽑기

url = "http://news.naver.com/main/read.nhn?oid=020&sid1=103&aid=0003113654&mid=shm&mode=LSD&nh=20171208081907"
http = HTTParty.get(url)
response = Nokogiri::HTML(http.body)
title = response.css('#articleTitle')

puts title.text

# puts output.text