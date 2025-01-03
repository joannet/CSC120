import os
import xml.etree.ElementTree as ET

# Define points for each test case
test_points = {
    'testAdd': 10,
    'testSubtract': 10,
    # Add more tests and their points here
}

# Initialize total points
total_points = 0
earned_points = 0

# Calculate total possible points
for points in test_points.values():
    total_points += points

# Iterate through each lab's test results
for module in os.listdir('.'):
    if module.startswith('Lab') and os.path.isdir(module):
        result_path = os.path.join(module, 'target', 'surefire-reports')
        if os.path.exists(result_path):
            for file in os.listdir(result_path):
                if file.endswith('.xml'):
                    tree = ET.parse(os.path.join(result_path, file))
                    root = tree.getroot()

                    # Iterate over each test case result
                    for testcase in root.iter('testcase'):
                        test_name = testcase.get('name')
                        if test_name in test_points:
                            # Check if the test failed
                            failure = testcase.find('failure')
                            if failure is None:
                                # Test passed, add points
                                earned_points += test_points[test_name]

# Print the results
print(f'Total Points: {total_points}')
print(f'Points Earned: {earned_points}')

# Optionally, create a grade report file
with open('grade_report.txt', 'w') as report:
    report.write(f'Total Points: {total_points}\n')
    report.write(f'Points Earned: {earned_points}\n')
