# 기술통계(summary)는 그룹별로 하기!
#___________________________________________

# Two-way factorial ANOVA

# library (Rling); data(sharedref)
head(sharedref)

# 독립변수 : age, cohort
# cohort (1, 2): 1983년 이전에 수화를 배웠는지, 이후에 배웠는지
# age (early, middle, late) : 수화를 배운 시기
# 팩터는 2개, 그룹은 2*3=6개

ref = aggregate(mod ~ age + cohort, data=sharedref, FUN="mean")
ref
# 나이가 어릴때 배울수록 mod가 크다
# 83년 이후에 배운 사람이 mod가 더 크다

interaction.plot(ref$age, ref$cohort, ref$mod)
# 평균값만 나타낸 그림

ref$age <- ordered(ref$age, levels = c("late", "middle", "early"))
interaction.plot(ref$age, ref$cohort, ref$mod)

#____________________________________
# 전제조건 확인
# 1 독립성이 있는지 없는지 : 같은 사람이 두번 배울수 없잖아

# 2 정규성 만족 :
# Shapiro-Wilk test(데이터 50개 이하),
# Kolmogorov-Smirnov test(데이터 클 때)
aggregate(mod ~ age + cohort, data=sharedref, function(x) shapiro.test(x)$p.value)
# 각각의 조합에 대한 p-value를 보여줌
# 애그리게이트 안쓰고 샤피로를 6번해도 된다
s=sharedref
e_1 = subset(s, s$age=='early'&s$cohort=='1')
shapiro.test(e_1$mod)

# 3 등분산성 만족 : Fligner-Killean median test
fligner.test(mod ~ interaction(age, cohort), data=sharedref)

#______________________________
# 아노바 시행
sharedref.aov = aov(mod ~ age*cohort, data=sharedref) 
summary(sharedref.aov)
anova(lm(mod ~ age*cohort, data=sharedref))

#_______________________________
# 사후검정
sharedref.aov = aov(mod ~ age*cohort, data=sharedref)
TukeyHSD(sharedref.aov,"age")
TukeyHSD(sharedref.aov,"cohort")
TukeyHSD(sharedref.aov)

model.tables(sharedref.aov, type = "means", se=T)

#___________________________________________
# Repeated measures & mixed ANOVA

# library (Rling)
head(time_exper)

boxplot (rt ~ Subj, data = time_exper, xlab="Subjects", ylab="RT (ms)", col=c(rep("yellow", 10), rep("white", 10)))
legend("topright", c("Chinese", "English"), fill =c("yellow","white"))

boxplot (rt ~ Prime, data = time_exper, xlab="Subjects", ylab="RT (ms)")
boxplot (rt ~ Lang, data = time_exper, xlab="Subjects", ylab="RT (ms)")

# One-way repeated measures & mixed ANOVA
# 미국인 화자가 세로로된걸 볼때, 가로로된걸 볼 때 차이가 있을까?

eng = subset(time_exper, Lang == "EN")
boxplot(rt ~ Prime, data = eng)
md.aov = aov(rt ~ Prime + Error(Subj/Prime), data=eng)
summary(md.aov)

# 0.00282 ** : 차이가 있다!
# 17ppt 27page까지 기말범위