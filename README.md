# HomeChallengeTask

Task 1 - Exploratory Testing Report for Monefy App (Android)

 1. Exploratory Testing Charters

 Charter 1: Onboarding and Initial Setup
- Objective: Verify that the onboarding process is intuitive and the app is set up correctly for first-time users.
- Scope: App installation, initial launch, and setup of currency, categories, and budget.
- Test Ideas:
  - Does the app prompt for necessary permissions (e.g., storage)?
  - Can the user select their preferred currency?
  - Are default categories (e.g., groceries, transportation) preloaded?
  - Can the user add a custom category?
  - Can the user add a custom category?
  - Is the budget setup process clear and functional?

 Charter 2: Adding and Managing Transactions
- Objective: Ensure that users can add, edit, and delete transactions without errors.
- Scope: Adding income and expenses, editing transactions, and deleting entries.
- Test Ideas:
  - Can the user add a new income or expense transaction?
  - Are the date, amount, and category fields working correctly?
  - Can the user edit an existing transaction?
  - Does deleting a transaction remove it from the records?
  - Are transactions reflected accurately in the balance?

 Charter 3: Budget Management
- Objective: Verify that budget setup and tracking work as expected.
- Scope: Setting a budget, tracking expenses against the budget, and receiving notifications.
- Test Ideas:
  - Can the user set a monthly budget?
  - Does the app track expenses against the budget?
  - Are notifications sent when the budget is nearing or exceeded?
  - Is the budget reset correctly at the start of a new month?

 Charter 4: Data Visualization and Reports
- Objective: Ensure that the app provides accurate and meaningful visualizations of financial data.
- Scope: Graphs, charts, and reports.
- Test Ideas:
  - Are pie charts and bar graphs displayed correctly?
  - Do the reports reflect the correct time period (e.g., weekly, monthly)?
  - Can the user export reports?
  - Are the visualizations updated in real-time when new transactions are added?

 Charter 5: Backup and Restore Functionality
- Objective: Verify that user data can be backed up and restored without loss.
- Scope: Backup to Google Drive and restore functionality.
- Test Ideas:
  - Can the user create a backup to Google Drive?
  - Does the app prompt for Google account login?
  - Can the user restore data from a backup?
  - Is all data (transactions, categories, budgets) restored accurately?

 Charter 6: App Performance and Usability
- Objective: Evaluate the app's performance and user experience.
- Scope: App responsiveness, UI/UX, and edge cases.
- Test Ideas:
  - Does the app crash under heavy usage?
  - Are there any UI elements that are misaligned or hard to use?
  - How does the app handle low storage or poor network conditions?
  - Is the app intuitive for first-time users?

---

 2. Findings from Charters

 Charter 1: Onboarding and Initial Setup
- Findings:
  - The app prompts for storage permission on first launch.
  - Currency selection is straightforward, with a wide range of options.
  - Default categories are preloaded, and custom categories can be added easily.
  - The budget setup process is clear but lacks advanced options (e.g., category-specific budgets).
- Bugs: None.

 Charter 2: Adding and Managing Transactions
- Findings:
  - Adding transactions is simple and intuitive.
  - Editing and deleting transactions work as expected.
  - Transactions are reflected accurately in the balance.
- Bugs:
  - Bug 1: When editing a transaction, the date picker occasionally resets to the current date instead of retaining the original date.
  - Bug 2: Deleting a transaction sometimes causes a slight delay before the balance updates.

 Charter 3: Budget Management
- Findings:
  - Budget setup is easy, but the app lacks granularity (e.g., no weekly budgets).
  - Expenses are tracked against the budget accurately.
  - Notifications for budget limits are not customizable.
- Bugs: None.

 Charter 4: Data Visualization and Reports
- Findings:
  - Graphs and charts are visually appealing and update in real-time.
  - Reports can be exported as CSV files.
- Bugs:
  - Bug 3: The pie chart occasionally displays incorrect percentages for small transaction amounts.

 Charter 5: Backup and Restore Functionality
- Findings:
  - Backup to Google Drive works seamlessly.
  - Restoring data is straightforward, and all data is retained.
- Bugs: None.

 Charter 6: App Performance and Usability
- Findings:
  - The app is responsive and does not crash under normal usage.
  - UI elements are well-aligned and intuitive.
  - The app handles low storage gracefully but struggles with poor network conditions during backup.
- Bugs: None.

---

 3. Prioritization of Charters

 High Priority:
- Charter 2 (Adding and Managing Transactions): Critical functionality for the app. Bugs here directly impact user experience.
- Charter 5 (Backup and Restore Functionality): Data loss is a significant risk, making this a high priority.

 Medium Priority:
- Charter 4 (Data Visualization and Reports): Visualizations are important for user satisfaction, but bugs are minor.
- Charter 3 (Budget Management): Budget tracking is essential, but the lack of advanced features is not a critical bug.

 Low Priority:
- Charter 1 (Onboarding and Initial Setup): Works as expected with no major issues.
- Charter 6 (App Performance and Usability): The app performs well, and usability issues are minimal.

---

 4. Risks to Mitigate

 1. Data Loss Risk:
   - Mitigation: Ensure robust backup and restore functionality. Regularly test backups for integrity.

 2. Security Risk:
   - Mitigation: Encrypt sensitive data (e.g., transaction details) and ensure secure authentication for Google Drive backups.

 3. Usability Risk:
   - Mitigation: Conduct user testing to identify pain points in the UI/UX, especially for first-time users.

 4. Performance Risk:
   - Mitigation: Optimize the app for low-end devices and poor network conditions.

 5. Compliance Risk:
   - Mitigation: Ensure the app complies with regional data protection laws (e.g., GDPR).
