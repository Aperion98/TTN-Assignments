var db = [
{Name:'Demo', Age: 21, Salary: 50000, DOB:'01-01-2016'},
{Name:'Demo2', Age: 21, Salary: 70000, DOB:'01-01-2016'},
{Name:'Demo3', Age: 21, Salary: 80000, DOB:'01-01-2016'},
{Name:'Demo4', Age: 21, Salary: 90000, DOB:'01-01-2016'},]


/* Question 5 Part 2*/
console.log(db)

let incsal = [];
for (let i = 0; i< db.length; i++){
if (db[i].Salary > 5000){
incsal.push(db[i]);}}

console.log(incsal);
/*Question 5 Part 3*/
let groupt = db.reduce((r,a) => {
	r[a.Age] = [...r[a.Age] || [], a]
	return r;
},{});
/* Question 5 Part 4*/
let increment = [];
for (let k = 0; k< db.length; k++){
if (db[k].Salary < 1000 && db[k].Age>20){
let po = db[k].Salary * 5;
increment.push(po);}}

console.log(increment);