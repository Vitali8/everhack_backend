
INSERT INTO roles (title, parent_id, current, blocked)
VALUES ('IT Industry', NULL, false, true);

INSERT INTO roles (title, parent_id, current, blocked)
SELECT 'Developer', id, false, true
FROM roles
WHERE title = 'IT Industry';

INSERT INTO roles (title, parent_id, current, blocked)
SELECT 'Java', id, false, true
FROM roles
WHERE title = 'Developer';

INSERT INTO roles (title, parent_id, current, blocked)
SELECT 'Java Principal', id, false, false
FROM roles
WHERE title = 'Java';

INSERT INTO roles (title, parent_id, current, blocked)
SELECT 'Java Senior', id, false, false
FROM roles
WHERE title = 'Java Principal';

INSERT INTO roles (title, parent_id, current, blocked)
SELECT 'Java Middle', id, true, false
FROM roles
WHERE title = 'Java Senior';

INSERT INTO roles (title, parent_id, current, blocked)
SELECT 'Java Junior', id, false, true
FROM roles
WHERE title = 'Java Middle';

INSERT INTO roles (title, parent_id, current, blocked)
SELECT 'Kotlin', id, false, true
FROM roles
WHERE title = 'Developer';

INSERT INTO roles (title, parent_id, current, blocked)
SELECT 'Kotlin Principal', id, false, true
FROM roles
WHERE title = 'Kotlin';

INSERT INTO roles (title, parent_id, current, blocked)
SELECT 'Kotlin Senior', id, false, true
FROM roles
WHERE title = 'Kotlin Principal';

INSERT INTO roles (title, parent_id, current, blocked)
SELECT 'Kotlin Middle', id, false, true
FROM roles
WHERE title = 'Kotlin Senior';

INSERT INTO roles (title, parent_id, current, blocked)
SELECT 'Kotlin Junior', id, false, false
FROM roles
WHERE title = 'Kotlin Middle';

INSERT INTO roles (title, parent_id, current, blocked)
SELECT 'JavaScript', id, false, true
FROM roles
WHERE title = 'Developer';

INSERT INTO roles (title, parent_id, current, blocked)
SELECT 'JavaScript Principal', id, false, true
FROM roles
WHERE title = 'JavaScript';

INSERT INTO roles (title, parent_id, current, blocked)
SELECT 'JavaScript Senior', id, false, true
FROM roles
WHERE title = 'JavaScript Principal';

INSERT INTO roles (title, parent_id, current, blocked)
SELECT 'JavaScript Middle', id, false, true
FROM roles
WHERE title = 'JavaScript Senior';

INSERT INTO roles (title, parent_id, current, blocked)
SELECT 'JavaScript Junior', id, false, false
FROM roles
WHERE title = 'JavaScript Middle';

INSERT INTO roles (title, parent_id, current, blocked)
SELECT 'QA', id, false, true
FROM roles
WHERE title = 'IT Industry';

INSERT INTO roles (title, parent_id, current, blocked)
SELECT 'QA Principal', id, false, true
FROM roles
WHERE title = 'QA';

INSERT INTO roles (title, parent_id, current, blocked)
SELECT 'QA Senior', id, false, true
FROM roles
WHERE title = 'QA Principal';

INSERT INTO roles (title, parent_id, current, blocked)
SELECT 'QA Middle', id, false, true
FROM roles
WHERE title = 'QA Senior';

INSERT INTO roles (title, parent_id, current, blocked)
SELECT 'QA Junior', id, false, false
FROM roles
WHERE title = 'QA Middle';
