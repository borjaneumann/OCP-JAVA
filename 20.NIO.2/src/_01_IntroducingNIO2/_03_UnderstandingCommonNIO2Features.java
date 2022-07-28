package _01_IntroducingNIO2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class _03_UnderstandingCommonNIO2Features {
        /*APPLYING PATH SYMBOLS
    Absolute and relative paths can contain path symbols. A path symbol is a
    reserved series of characters that have special meaning within some file
    systems.

    Symbol  Description
    =============================================================
    .       A reference to the current directory
    ..      A reference to the parent of the current directory

    fish                            ../..
      |_  shark                     ..
      |     |_ swim.txt             ../swim.txt
      |     |_hammerhead            .(current Directory)
      |          |_play.png         ./play.png
      |_clownfish                   ../../clownfish

     */

    /* Providing Optional arguments
    Enum type           Interface        Enum value            Details
                        inherited
    ========================================================================================================
    LinkOption          CopyOption       NOFOLLOW_LINKS        Do not follow symbolic links.
                        OpenOption       NOFOLLOW_LINKS        Do not follow symbolic links.
    --------------------------------------------------------------------------------------------------------
    Standard            CopyOption       ATOMIC_MOVE           Move file as atomic file system operation.
    CopyOption                           COPY_ATTRIBUTES       Copy existing attributes to new file.
                                         REPLACE_EXISTING      Overwrite file if it already exists.
    -------------------------------------------------------------------------------------------------------
                                         APPEND                If file is already open for write,
                                                               then append to the end.
                                         CREATE                Create a new file if it does not exist.
    Standard                             CREATE_NEW            Create a new file only if it does not exist,
    OpenOption          OpenOption                             fail otherwise.
                                         READ                  Open for read access.
                                         TRUNCATE_EXISTING     If file is already open for write,
                                                               then erase file and append to beginning.
                                         WRITE                 Open for write access.
    --------------------------------------------------------------------------------------------------------
    FileVisitOption     N/A              FOLLOW_LINKS          Follow symbolic links.
     */

    /*
    With the exceptions of Files.copy() and Files.move() (which we'll cover later), we won't discuss these varargs parameters each time we
    present a method.

    Path path = Paths.get("schedule.xml");
    boolean exists = Files.exists(path,
    LinkOption.NOFOLLOW_LINKS);

    The Files.exists() simply checks whether a file exists. If the parameter
    is a symbolic link, though, then the method checks whether the target of
    the symbolic link exists instead. Providing LinkOption.NOFOLLOW_LINKS
    means the default behavior will be overridden, and the method will check
    whether the symbolic link itself exists.

    The Files.move() method takes a CopyOption vararg so it can take enums of
    different types.
    */
    void copy(Path source, Path target) throws IOException {
        Files.move(source, target,
                LinkOption.NOFOLLOW_LINKS,
                StandardCopyOption.ATOMIC_MOVE);
    }

    /*Many of the NIO.2 methods use a varargs for passing options, even
    when there is only one enum value available. The advantage of this
    approach, as opposed to say just passing a boolean argument, is
    future‐proofing. These method signatures are insulated from changes
    in the Java language down the road when future options are
    available.

    Handling Methods That Declare IOException
    =========================================
    Many of the methods presented in this chapter declare IOException.
    Common causes of a method throwing this exception include the
    following:
    - Loss of communication to underlying file system.
    - File or directory exists but cannot be accessed or modified.
    - File exists but cannot be overwritten.
    - File or directory is required but does not exist.
    In general, methods that operate on abstract Path values, such as those in
    the Path interface or Paths class, often do not throw any checked
    exceptions. On the other hand, methods that operate or change files and
    directories, such as those in the Files class, often declare IOException.
    There are exceptions to this rule, as we will see. For example, the method
    Files.exists() does not declare IOException. If it did throw an
    exception when the file did not exist, then it would never be able to return
    false!

     */

}
