/* Tools20022 - API for ISO 20022
* Copyright (C) 2017 Tools20022.com - László Bukodi 
* 
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
* 
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
* 
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.StatisticalReportingStatusCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the status of a single statistical reporting transaction or of a
 * group of statistical reporting transactions.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.StatisticalReportingStatusCode#AcceptedTechnicalValidation
 * StatisticalReportingStatusCode.AcceptedTechnicalValidation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.StatisticalReportingStatusCode#Received
 * StatisticalReportingStatusCode.Received}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.StatisticalReportingStatusCode#PartiallyAccepted
 * StatisticalReportingStatusCode.PartiallyAccepted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.StatisticalReportingStatusCode#Rejected
 * StatisticalReportingStatusCode.Rejected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.StatisticalReportingStatusCode#Pending
 * StatisticalReportingStatusCode.Pending}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.StatisticalReportingStatusCode#Accepted
 * StatisticalReportingStatusCode.Accepted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.StatisticalReportingStatusCode#Warning
 * StatisticalReportingStatusCode.Warning}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.StatisticalReportingStatusCode#Reminder
 * StatisticalReportingStatusCode.Reminder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.StatisticalReportingStatusCode#CorruptedFile
 * StatisticalReportingStatusCode.CorruptedFile}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.StatisticalReportingStatusCode#IncorrectFilename
 * StatisticalReportingStatusCode.IncorrectFilename}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.StatisticalReportingStatusCode#AcceptedAfterPending
 * StatisticalReportingStatusCode.AcceptedAfterPending}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.StatisticalReportingStatusCode#RejectedAfterPending
 * StatisticalReportingStatusCode.RejectedAfterPending}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.StatisticalReportingStatus1Code
 * StatisticalReportingStatus1Code}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"ACTC"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "StatisticalReportingStatusCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the status of a single statistical reporting transaction or of a group of statistical reporting transactions."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class StatisticalReportingStatusCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Transaction or report has passed syntactical and semantical validation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.StatisticalReportingStatusCode
	 * StatisticalReportingStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ACTC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcceptedTechnicalValidation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction or report has passed syntactical and semantical validation."
	 * </li>
	 * </ul>
	 */
	public static final StatisticalReportingStatusCode AcceptedTechnicalValidation = new StatisticalReportingStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcceptedTechnicalValidation";
			definition = "Transaction or report has passed syntactical and semantical validation.";
			owner_lazy = () -> com.tools20022.repository.codeset.StatisticalReportingStatusCode.mmObject();
			codeName = "ACTC";
		}
	};
	/**
	 * Report has been received.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.StatisticalReportingStatusCode
	 * StatisticalReportingStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RCVD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Received"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Report has been received."</li>
	 * </ul>
	 */
	public static final StatisticalReportingStatusCode Received = new StatisticalReportingStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Received";
			definition = "Report has been received.";
			owner_lazy = () -> com.tools20022.repository.codeset.StatisticalReportingStatusCode.mmObject();
			codeName = "RCVD";
		}
	};
	/**
	 * Report has been partially accepted. A number of transactions have been
	 * accepted, whereas another number of transactions have not yet been
	 * accepted.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.StatisticalReportingStatusCode
	 * StatisticalReportingStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PART"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartiallyAccepted"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Report has been partially accepted. A number of transactions have been accepted, whereas another number of transactions have not yet been accepted."
	 * </li>
	 * </ul>
	 */
	public static final StatisticalReportingStatusCode PartiallyAccepted = new StatisticalReportingStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartiallyAccepted";
			definition = "Report has been partially accepted. A number of transactions have been accepted, whereas another number of transactions have not yet been accepted.";
			owner_lazy = () -> com.tools20022.repository.codeset.StatisticalReportingStatusCode.mmObject();
			codeName = "PART";
		}
	};
	/**
	 * Transaction or report has been rejected.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.StatisticalReportingStatusCode
	 * StatisticalReportingStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RJCT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rejected"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction or report has been rejected."</li>
	 * </ul>
	 */
	public static final StatisticalReportingStatusCode Rejected = new StatisticalReportingStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Rejected";
			definition = "Transaction or report has been rejected.";
			owner_lazy = () -> com.tools20022.repository.codeset.StatisticalReportingStatusCode.mmObject();
			codeName = "RJCT";
		}
	};
	/**
	 * Processing of transaction or report is pending.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.StatisticalReportingStatusCode
	 * StatisticalReportingStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PDNG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Pending"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Processing of transaction or report is pending."</li>
	 * </ul>
	 */
	public static final StatisticalReportingStatusCode Pending = new StatisticalReportingStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Pending";
			definition = "Processing of transaction or report is pending.";
			owner_lazy = () -> com.tools20022.repository.codeset.StatisticalReportingStatusCode.mmObject();
			codeName = "PDNG";
		}
	};
	/**
	 * Transaction or report has been accepted.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.StatisticalReportingStatusCode
	 * StatisticalReportingStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ACPT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Accepted"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction or report has been accepted."</li>
	 * </ul>
	 */
	public static final StatisticalReportingStatusCode Accepted = new StatisticalReportingStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Accepted";
			definition = "Transaction or report has been accepted.";
			owner_lazy = () -> com.tools20022.repository.codeset.StatisticalReportingStatusCode.mmObject();
			codeName = "ACPT";
		}
	};
	/**
	 * Transaction has been accepted with warnings.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.StatisticalReportingStatusCode
	 * StatisticalReportingStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "WARN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Warning"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction has been accepted with warnings."</li>
	 * </ul>
	 */
	public static final StatisticalReportingStatusCode Warning = new StatisticalReportingStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Warning";
			definition = "Transaction has been accepted with warnings.";
			owner_lazy = () -> com.tools20022.repository.codeset.StatisticalReportingStatusCode.mmObject();
			codeName = "WARN";
		}
	};
	/**
	 * Reminder of a non received report.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.StatisticalReportingStatusCode
	 * StatisticalReportingStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RMDR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reminder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reminder of a non received report."</li>
	 * </ul>
	 */
	public static final StatisticalReportingStatusCode Reminder = new StatisticalReportingStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reminder";
			definition = "Reminder of a non received report.";
			owner_lazy = () -> com.tools20022.repository.codeset.StatisticalReportingStatusCode.mmObject();
			codeName = "RMDR";
		}
	};
	/**
	 * File containing the report is corrupted.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.StatisticalReportingStatusCode
	 * StatisticalReportingStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CRPT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorruptedFile"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "File containing the report is corrupted."</li>
	 * </ul>
	 */
	public static final StatisticalReportingStatusCode CorruptedFile = new StatisticalReportingStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorruptedFile";
			definition = "File containing the report is corrupted.";
			owner_lazy = () -> com.tools20022.repository.codeset.StatisticalReportingStatusCode.mmObject();
			codeName = "CRPT";
		}
	};
	/**
	 * File containing the report has an incorrect filename.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.StatisticalReportingStatusCode
	 * StatisticalReportingStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INCF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectFilename"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "File containing the report has an incorrect filename."</li>
	 * </ul>
	 */
	public static final StatisticalReportingStatusCode IncorrectFilename = new StatisticalReportingStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectFilename";
			definition = "File containing the report has an incorrect filename.";
			owner_lazy = () -> com.tools20022.repository.codeset.StatisticalReportingStatusCode.mmObject();
			codeName = "INCF";
		}
	};
	/**
	 * Transaction or report has been accepted, following a pending status.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.StatisticalReportingStatusCode
	 * StatisticalReportingStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ACPD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcceptedAfterPending"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction or report has been accepted, following a pending status."</li>
	 * </ul>
	 */
	public static final StatisticalReportingStatusCode AcceptedAfterPending = new StatisticalReportingStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcceptedAfterPending";
			definition = "Transaction or report has been accepted, following a pending status.";
			owner_lazy = () -> com.tools20022.repository.codeset.StatisticalReportingStatusCode.mmObject();
			codeName = "ACPD";
		}
	};
	/**
	 * Transaction or report has been rejected, following a pending status.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.StatisticalReportingStatusCode
	 * StatisticalReportingStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RJPD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RejectedAfterPending"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction or report has been rejected, following a pending status."</li>
	 * </ul>
	 */
	public static final StatisticalReportingStatusCode RejectedAfterPending = new StatisticalReportingStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RejectedAfterPending";
			definition = "Transaction or report has been rejected, following a pending status.";
			owner_lazy = () -> com.tools20022.repository.codeset.StatisticalReportingStatusCode.mmObject();
			codeName = "RJPD";
		}
	};
	final static private LinkedHashMap<String, StatisticalReportingStatusCode> codesByName = new LinkedHashMap<>();

	protected StatisticalReportingStatusCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("ACTC");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "StatisticalReportingStatusCode";
				definition = "Specifies the status of a single statistical reporting transaction or of a group of statistical reporting transactions.";
				derivation_lazy = () -> Arrays.asList(StatisticalReportingStatus1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.StatisticalReportingStatusCode.AcceptedTechnicalValidation, com.tools20022.repository.codeset.StatisticalReportingStatusCode.Received,
						com.tools20022.repository.codeset.StatisticalReportingStatusCode.PartiallyAccepted, com.tools20022.repository.codeset.StatisticalReportingStatusCode.Rejected,
						com.tools20022.repository.codeset.StatisticalReportingStatusCode.Pending, com.tools20022.repository.codeset.StatisticalReportingStatusCode.Accepted,
						com.tools20022.repository.codeset.StatisticalReportingStatusCode.Warning, com.tools20022.repository.codeset.StatisticalReportingStatusCode.Reminder,
						com.tools20022.repository.codeset.StatisticalReportingStatusCode.CorruptedFile, com.tools20022.repository.codeset.StatisticalReportingStatusCode.IncorrectFilename,
						com.tools20022.repository.codeset.StatisticalReportingStatusCode.AcceptedAfterPending, com.tools20022.repository.codeset.StatisticalReportingStatusCode.RejectedAfterPending);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(AcceptedTechnicalValidation.getCodeName().get(), AcceptedTechnicalValidation);
		codesByName.put(Received.getCodeName().get(), Received);
		codesByName.put(PartiallyAccepted.getCodeName().get(), PartiallyAccepted);
		codesByName.put(Rejected.getCodeName().get(), Rejected);
		codesByName.put(Pending.getCodeName().get(), Pending);
		codesByName.put(Accepted.getCodeName().get(), Accepted);
		codesByName.put(Warning.getCodeName().get(), Warning);
		codesByName.put(Reminder.getCodeName().get(), Reminder);
		codesByName.put(CorruptedFile.getCodeName().get(), CorruptedFile);
		codesByName.put(IncorrectFilename.getCodeName().get(), IncorrectFilename);
		codesByName.put(AcceptedAfterPending.getCodeName().get(), AcceptedAfterPending);
		codesByName.put(RejectedAfterPending.getCodeName().get(), RejectedAfterPending);
	}

	public static StatisticalReportingStatusCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static StatisticalReportingStatusCode[] values() {
		StatisticalReportingStatusCode[] values = new StatisticalReportingStatusCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, StatisticalReportingStatusCode> {
		@Override
		public StatisticalReportingStatusCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(StatisticalReportingStatusCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}