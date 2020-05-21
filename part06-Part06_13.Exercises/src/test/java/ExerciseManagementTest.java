
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;

public class ExerciseManagementTest {

    private ExerciseManagement exerciseManagement;

    @Before
    public void initialize() {
        exerciseManagement = new ExerciseManagement();
    }

    @Test
    public void exerciseListIsEmpty() {
        assertEquals(0, exerciseManagement.exerciseList().size());
    }

    @Test
    public void addingExerciseGrowsListByOne() {
        exerciseManagement.add("Write a test");
        assertEquals(1, exerciseManagement.exerciseList().size());
    }

    @Test
    public void addedExerciseIsInList() {
        exerciseManagement.add("Write a test");
        assertTrue(exerciseManagement.exerciseList().contains("Write a test"));
    }

    @Test
    public void exerciseCanBeMarkedAsCompleted() {
        exerciseManagement.add("New exercise");
        exerciseManagement.markAsCompleted("New exercise");
        assertTrue(exerciseManagement.isCompleted("New exercise"));
    }

    @Test
    public void exerciseIfNotMarkedCompletedIsNotCompleted() {
        exerciseManagement.add("New exercise");
        exerciseManagement.markAsCompleted("New exercise");
        assertFalse(exerciseManagement.isCompleted("Some exercise"));
    }
}
