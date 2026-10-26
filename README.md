# Lab 7: GitHub Actions CI

Java calculator with three JUnit 5 tests and a Java 17 Maven workflow.

## Local verification
- Initial build: 3 tests passed; JAR created.
- Intentional bug (`a - b`): 2 tests failed, 1 passed.
- Restored addition (`a + b`): 3 tests passed; JAR created.
- Local Java: Eclipse Temurin 25, targeting Java 17. GitHub workflow uses Temurin 17.

Logs are in `evidence/`. The final working tree contains the correct addition.

## Git history
1. initial commit
2. intentional bug to test CI
3. fix calculator addition

## GitHub execution
Repository: https://github.com/bet88bot-stack/calculator-app

- Initial successful run: https://github.com/bet88bot-stack/calculator-app/actions/runs/40308764000
- Intentional bug run: https://github.com/bet88bot-stack/calculator-app/actions/runs/40308939631

The workflow builds on pushes and pull requests to main, packages the JAR, and uploads test reports and the JAR as artifacts.

