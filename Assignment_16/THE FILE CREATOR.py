import os

def create_java_files(num_files,ass, base_path="."):
    """
    Creates empty .java files in the specified directory.

    Args:
        num_files (int): The number of .java files to create.
        base_path (str): The directory where the files will be created.
    """
   
    # ✅ Ensure the target directory exists
    os.makedirs(base_path, exist_ok=True)

    for i in range(1, num_files + 1):
        file_name = f"program{ass}_{i}.java"
        file_path = os.path.join(base_path, file_name)

        # Create an empty .java file
        with open(file_path, 'w') as f:
            pass

        print(f"Created empty file: {file_path}")

# ✅ Example usage
create_java_files(5,21, r"D:\JAVA_PROGRAMMING\Assignment21")
