# Task 4: Linux/Unix basics

## What this task asks

Using any log/text file:

1. `grep` — find lines containing `FAIL` or `ERROR`
2. `awk` — print just the second column from a space-delimited file
3. `sed` — find-and-replace (e.g. `staging` → `production`)
4. Chain at least two of the above with a pipe (`|`)

**Source (assignment):** `HyperExecute_SE_Assignment.pdf` → Task 4

---

## Sample input file

Created: [`sample.log`](./sample.log)

```text
2026-07-16 01:10:00 INFO  Job started on Windows 10
2026-07-16 01:10:05 INFO  ENVIRONMENT staging
2026-07-16 01:10:12 ERROR Invalid target release: 11
2026-07-16 01:10:15 FAIL  Scenario Test_4 failed
2026-07-16 01:10:20 INFO  Retry scheduled for Test_4
2026-07-16 01:10:28 ERROR Maven surefire reported a failure
2026-07-16 01:10:35 FAIL  Scenario Test_Task3_Fail failed
2026-07-16 01:10:40 INFO  Job finished with status failed
```

(Space-delimited columns: `$1`=date, `$2`=time, `$3`=level, rest=message)

---

## 1) grep — find FAIL / ERROR lines

**Command**
```bash
grep -E 'FAIL|ERROR' assignment/task4/sample.log
```

**One-line explanation:**  
`grep -E` searches with extended regex and prints every line matching `FAIL` or `ERROR`.

**Output**
```text
2026-07-16 01:10:12 ERROR Invalid target release: 11
2026-07-16 01:10:15 FAIL  Scenario Test_4 failed
2026-07-16 01:10:28 ERROR Maven surefire reported a failure
2026-07-16 01:10:35 FAIL  Scenario Test_Task3_Fail failed
```

---

## 2) awk — print the second column

**Command**
```bash
awk '{print $2}' assignment/task4/sample.log
```

**One-line explanation:**  
`awk` splits each line on whitespace and prints field `$2` (the timestamp).

**Output**
```text
01:10:00
01:10:05
01:10:12
01:10:15
01:10:20
01:10:28
01:10:35
01:10:40
```

---

## 3) sed — replace staging with production

**Command**
```bash
sed 's/staging/production/g' assignment/task4/sample.log
```

**One-line explanation:**  
`sed 's/old/new/g'` substitutes all occurrences of `staging` with `production` on each line (`g` = global per line).

**Output (relevant line highlighted)**
```text
2026-07-16 01:10:00 INFO  Job started on Windows 10
2026-07-16 01:10:05 INFO  ENVIRONMENT production
2026-07-16 01:10:12 ERROR Invalid target release: 11
...
```

Only the `ENVIRONMENT` line changes (`staging` → `production`).

---

## 4) Pipe — chain grep + awk

**Command**
```bash
grep 'ERROR' assignment/task4/sample.log | awk '{print $2}'
```

**One-line explanation:**  
`grep` filters ERROR lines, then `|` sends that output to `awk`, which prints only the timestamp (`$2`) of those errors.

**Output**
```text
01:10:12
01:10:28
```

### Extra meaningful pipe (also valid)

```bash
grep -E 'FAIL|ERROR' assignment/task4/sample.log | awk '{print $3, $4, $5, $6, $7}'
```

Filters failure lines, then prints level + start of the message (useful when debugging HyperExecute/Maven logs).

---

## Why these tools matter for HyperExecute / SE work

Same pattern used in this repo’s YAML discovery command:

```bash
grep 'test name' xml/testng_win.xml | awk '{print$2}' | sed 's/name=//g' | sed 's/\x3e//g'
```

That is exactly **grep → awk → sed** piped together to discover test names.

---

## Evidence checklist

- [x] Exact commands documented
- [x] One-line explanation per command
- [x] Sample input (`sample.log`) and captured output
- [x] At least one meaningful pipe (`grep | awk`)
