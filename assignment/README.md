# HyperExecute SE Assignment — Deliverables

This folder contains task-wise submission materials for the Solutions Engineer HyperExecute assignment.

| Task | Status | Folder |
|---|---|---|
| Task 1: Fix the broken YAML | Done | [`task1/`](./task1/) |
| Task 2: Environment variables | Done | [`task2/`](./task2/) |
| Task 3: Force failure + retries | Done | [`task3/`](./task3/) |
| Task 4: Linux/Unix basics | Done | [`task4/`](./task4/) |

## Task 1 quick links

- Notes (errors + explanation): [`task1/NOTES.md`](./task1/NOTES.md)
- Corrected YAML: [`task1/testng_hyperexecute_fixme_fixed.yaml`](./task1/testng_hyperexecute_fixme_fixed.yaml)
- Screenshots: [`task1/screenshots/`](./task1/screenshots/)
- Successful evidence: Job **#9** Completed — all 4 scenarios passed

## Task 2 quick links

- Notes: [`task2/NOTES.md`](./task2/NOTES.md)
- YAML: [`task2/testng_hyperexecute_task2.yaml`](./task2/testng_hyperexecute_task2.yaml)
- Code: `src/test/java/Test1.java` (prints `ENVIRONMENT`)
- Screenshots: [`task2/screenshots/`](./task2/screenshots/)
- Successful evidence: Job **#10** Completed — `Task2_ENVIRONMENT=staging` in pre + Test_1 logs

## Task 3 quick links

- Notes: [`task3/NOTES.md`](./task3/NOTES.md)
- Fail test: `src/test/java/Task3FailTest.java`
- YAML: [`task3/testng_hyperexecute_task3.yaml`](./task3/testng_hyperexecute_task3.yaml)
- Screenshots: [`task3/screenshots/`](./task3/screenshots/)
- Evidence: Job **#11** FAILED as expected — `"Test_Task3_Fail"` ran twice (attempt + retry)

## Task 4 quick links

- Notes (commands + I/O): [`task4/NOTES.md`](./task4/NOTES.md)
- Sample log: [`task4/sample.log`](./task4/sample.log)
