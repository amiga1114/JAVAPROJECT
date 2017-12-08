Dir.chdir('src')

puts Dir.pwd

list = Dir.entries(Dir.pwd).reject {|name| name[0] == "."}


# list 출력
list.each do |faker|
	puts faker
end

# File.rename("a", "b") : a를 b로 변환
20.times do |n|
	File.rename("#{n+1}list.txt", "sap#{n+1}list.txt")
end


# list.each do |f|
# 	File.rename(f, "2017" + f)
# end

# concatenation : 합체 "" + ""
# interpolation : 인터폴(수술) "()"





