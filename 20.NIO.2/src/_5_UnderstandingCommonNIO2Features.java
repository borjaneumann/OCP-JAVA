public class _5_UnderstandingCommonNIO2Features {
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
    Enum type           Interface inherited       Enum value            Details
    ========================================================================================================
    LinkOption          CopyOption                NOFOLLOW_LINKS        Do not follow symbolic links.
                        OpenOption                NOFOLLOW_LINKS        Do not follow symbolic links.
    --------------------------------------------------------------------------------------------------------
    Standard            CopyOption                ATOMIC_MOVE           Move file as atomic file system operation.
    CopyOption                                    COPY_ATTRIBUTES       Copy existing attributes to new file.
                                                  REPLACE_EXISTING      Overwrite file if it already exists.
    -------------------------------------------------------------------------------------------------------
    Standard            OpenOption                APPEND                If file is already open for write, then append to the end.
    OpenOption                                    CREATE                Create a new file if it does not exist.
                                                  CREATE_NEW            Create a new file only if it does not exist, fail otherwise.
                                                  READ                  Open for read access.
                                                  TRUNCATE_EXISTING     If file is already open for write, then erase file and append to beginning.
                                                  WRITE                 Open for write access.
    --------------------------------------------------------------------------------------------------------
    FileVisitOption     N/A                       FOLLOW_LINKS          Follow symbolic links.
     */
}
