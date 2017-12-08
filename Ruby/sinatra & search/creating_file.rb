# # file 생성하기
File.open("out.txt", "w") do |f|
	f.write("Enjoy your life")
end


# # 반복문 & 숫자타입을 문자타입으로 변환
5.times do |timer|
	puts timer.to_s + "list"
end


# src folder로 이동
Dir.chdir('src')


# 이동 경로 확인
puts Dir.pwd


# .txt 20개 만들기
# 몇번쨰 파일 + list
# 1list.txt > 내용물 : 1번째 파일입니다.
# 2list.txt > 내용물 : 2번째 파일입니다.
# 3list.txt > 내용물 : 3번째 파일입니다.
20.times do |n|
	File.open("#{n + 1}list.txt", "w") do |f|
		f.write("#{n + 1}번째 파일입니다.")
  end
end


