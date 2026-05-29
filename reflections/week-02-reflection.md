# Week {{02}} Reflection

**Name: Patrick McLucas**
**Date: 05/28/2026**

---

## Commits This Week

<!-- Paste a link to your commits for this week. The easiest way: go to your repo on GitHub,
     click "commits", and copy the URL after filtering by your name or branch. -->

**Link:https://github.com/pmclucas/media-tracker-android/commit/f6973aabd4bd1cd26b2162874c22784795b5e4fe**


---

## Code Review

<!-- Every week you leave a review on a pod mate's pull request. Fill in both parts below.
     Part 1 is the link — I will verify the review exists on GitHub.
     Part 2 is your written assessment — what you actually looked at and what you found. -->

**Reviewed:** *(Dustin Marsh (dmarsh31)*
**Link to my review:https://github.com/dmarsh31/media-tracker-android/pull/4#pullrequestreview-4386178393**

### What I Looked At

<!-- Walk through the code you reviewed. What was the PR trying to do? Which files or
     functions did you focus on? -->
The code addressed issues 12-14 & 16-19.  No action was needed on issue #15 based on what we worked through in class.



### What I Noticed

<!-- Be specific. Did you spot a potential bug? A pattern that could cause problems? Something
     done well that you want to call out? "I looked at the ViewModel and everything seemed fine"
     is not specific enough. Name the thing you noticed and explain why it matters. -->

Noted in the changes to LibraryScreen.kt that the remember function for var selectedType did not need to be modified, but it still seems to work correctly.
I am unsure what the impact of changing remember to rememberSaveable has, but it also seemed to correct the filter resetting on rotate issue.
Everything else looks correct.

### Comments I Left

<!-- Briefly summarize the comments you left on the PR. If you left a positive comment,
     say what it was. If you left a suggestion, say what you suggested and why. -->

I left a comment about the change made to var selectedType remember -> rememberSaveable.  Based on what we worked on in class it should not be necessary for the bug fix.

---

## One Thing I Understood More Deeply

<!-- Be specific. Don't write "I learned about ViewModels." Write what specifically clicked —
     what was confusing before, what made it make sense, and how you'd explain it to someone else.
     There are no wrong answers here. -->
I found the instruction on reviewing Logcat to be helpful when tracking down where an issue originates from.  
It was also helpful learning a few of the shortcut commands for navigating the code.  Little tricks like this will really help me keep up with the pace of class.

---

## One Thing I'm Still Confused About

<!-- Be honest. This is the most useful part of the reflection for me — it tells me where to
     spend more time in class. You will not lose points for being confused. -->

I was a bit lost at time due to how quickly we were navigating through screens in class.  I'm sure this will become easier with experience.
I'll be taking more time this week to familiarize myself with the codebase.

---

## Anything Else *(optional)*

<!-- Did you help a pod mate work through something? Did you discover something cool or frustrating?
     Did something from a previous week finally click? This is a good place to put it. -->
Dustin noticed that if we changed remember to rememberSaveable for variables selectedStatus and selectedType in LibraryScreen.kt it also fixed the filter reset + rotate issue.

---

## Rubric

*You don't need to self-assess — this is here so you know what I'm looking at.*

| Section | Points | Full Credit | Half Credit | No Credit |
|:---|:---:|:---|:---|:---|
| **Reflection** | 10 | Specific, honest responses to "More Deeply" and "Still Confused" sections. Shows genuine thinking — not just "I learned X." | Responses are present but vague or generic ("I got better at Compose"). | Missing or one-word answers. |
| **Code Review** | 10 | Specific observation about the code with explanation of why it matters (or a substantive positive comment). Link to review present and verified. | A question or comment that shows you read the code, but lacks explanation. | "Looks good!" or equivalent. Missing link. Review not found on GitHub. |
| **Total** | **20** | | | |

**A note on the code review score:** I check that the review actually exists on GitHub before grading. The written summary here and the GitHub comment should match. If the review isn't there, the written summary can't earn credit.
