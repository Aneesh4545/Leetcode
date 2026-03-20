# Write your MySQL query statement below
(select u.name as results from Users u join MovieRating r on u.user_id = r.user_id 
group by r.user_id
order by count(r.rating) desc , u.name asc limit 1)
union all (
select m.title as results from Movies m join MovieRating r on m.movie_id = r.movie_id
where created_at like '2020-02-%'
group by r.movie_id order by avg(r.rating) desc, title asc limit 1);