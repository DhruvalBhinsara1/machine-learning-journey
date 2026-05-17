# Machine Learning Journey

A personal learning repository for building machine learning fundamentals with Python, scikit-learn, NumPy, and supporting computer science practice.

This repo is part study log, part notebook collection, and part small-project workspace. It includes hands-on notebooks for common ML workflows, Python and NumPy notes, DSA material, and a small decision tree music recommender example.

## What's Inside

- Core machine learning notebooks covering preprocessing, data splitting, regression, classification, clustering, PCA, pipelines, cross-validation, metrics, feature encoding, visualization, and hyperparameter tuning.
- A decision tree project that trains and saves a simple music recommender model from `music.csv`.
- Python notes for object-oriented programming, decorators, and advanced Python concepts.
- NumPy array notes and smaller example notebooks.
- DSA notes, PDFs, and practice programs in Java and C++.
- Reference material for deeper math and ML study.

## Repository Structure

```text
.
|-- Basic Notebooks/              # scikit-learn practice notebooks
|-- Core Python Notes/            # Python language notes
|-- DSA Notes/                    # DSA PDFs and Java/C++ practice programs
|-- DecisionTrees/
|   `-- Music Recommender/        # decision tree demo, dataset, saved model, DOT export
|-- Example Codes/                # extra ML examples and tutorials
|-- NumPy Notes/                  # NumPy array notes
|-- Reference Books/              # reference PDFs
|-- PROGRESS.md                   # short progress notes and cleanup ideas
`-- README.md
```

## Notebook Map

| Area | Files |
| --- | --- |
| ML basics | `preprocessing.ipynb`, `Data Splitting.ipynb`, `Metric.ipynb`, `Visualization.ipynb` |
| Supervised learning | `Regression.ipynb`, `classification.ipynb` |
| Model evaluation | `Cross Validation.ipynb`, `HyperParameter Tuning.ipynb` |
| Feature work | `Feature Encoding.ipynb`, `PCA.ipynb`, `Pipeline.ipynb` |
| Unsupervised learning | `Clustering.ipynb` |
| Python and NumPy | `Advanced Python.ipynb`, `OOPS.ipynb`, `NumPy Arrays.ipynb` |
| Projects/examples | `DecisionTree.ipynb`, `Music Suggestion.ipynb`, `Music Suggestion with job lib.ipynb`, `Example1.ipynb`, `python-sklearn-linear-regression.ipynb` |

## Featured Example: Music Recommender

The `DecisionTrees/Music Recommender/` folder contains a small decision tree classification example:

- `music.csv` - training data
- `DecisionTree.ipynb` - trains a `DecisionTreeClassifier`
- `music_recommender.joblib` - saved model artifact
- `music_recommender.dot` - GraphViz export of the trained tree
- `Music Suggestion with job lib.ipynb` - loads the saved model for prediction

It is intentionally simple and useful for practicing the train, save, load, and inspect cycle.

## Getting Started

Clone the repository:

```sh
git clone https://github.com/DhruvalBhinsara1/machine-learning-journey.git
cd machine-learning-journey
```

Create an environment and install the common notebook dependencies:

```sh
python -m venv .venv
source .venv/bin/activate
pip install jupyterlab notebook numpy pandas matplotlib scikit-learn joblib
```

Start Jupyter:

```sh
jupyter lab
```

Then open the notebook you want to study or run. Most notebooks are self-contained, but a few examples depend on local files in the same folder, such as `music.csv` in the Music Recommender project.

## Current Focus

The repo is currently focused on:

- Strengthening Python and NumPy foundations.
- Practicing the standard scikit-learn workflow: prepare data, train models, evaluate results, tune parameters, and save artifacts.
- Building up from small notebooks toward more complete ML projects.
- Keeping DSA practice alongside ML study for interview preparation.

## Notes

- This is a learning repo, not a packaged Python library.
- Some notebooks still need cleaner intro markdown and more consistent filenames.
- Generated files such as saved models and compiled classes are present where they support the learning examples.
- See `PROGRESS.md` for a short list of cleanup ideas and next steps.

## License

No license file is included yet.
