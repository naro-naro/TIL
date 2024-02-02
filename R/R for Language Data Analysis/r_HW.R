# page 39
# Grammaticality of a sentence was performed by 5400 people.
# Each rater gave a score ranging from 0 (ungrammatical) to 10 (perfectly grammatical) based on his or her intuition.
# The distribution of the score rating fits a ND such as N (4.5, 1.42).


# What is the percentage of raters who gave 7.0 or higher?
pnorm(7, 4.5, 1.42, lower.tail = F)*100

# Approximately, how many raters gave a score between 4 and 5?
over4_under4.5 = pnorm(4, 4.5, 1.42, lower.tail = F)-0.5
over4.5_under5 = pnorm(5, 4.5, 1.42, lower.tail = T)-0.5
over4_under5 = (over4_under4.5 + over4.5_under5)*5400
over4_under5

# What is the score point up to which 90% of raters are placed?
qnorm(0.9, 4.5, 1.42, lower.tail = T)


#____________________________________________________________________
# page 40
# In the 2nd semester of 2018, the average GPA of 245 undergraduate students was 3.29 (sd: 0.73) out of 4.5.


# If 15% of students are qualified for merit scholarship, what is the cut-off point of GPA for scholarship?
qnorm(0.15, 3.29, 0.73, lower.tail = F)

# Students whose GPA falls between 1.5 and 2.0 will face academic probation. How many will face it?
under2.0 = pnorm(2.0, 3.29, 0.73, lower.tail = T)
under1.5 = pnorm(1.5, 3.29, 0.73, lower.tail = T)
over1.5_under2.0 = (under2.0 - under1.5)*245
over1.5_under2.0

#Students whose GPA falls below 1.5 will incur an academic suspension. How many will face it?
under1.5*245

# What are limitations of this analysis?
# 학점이 3~4점대에만 몰려있어서 실제로는 정규분포의 모양을 띄지 않을 수 있다