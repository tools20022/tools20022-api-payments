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
import com.tools20022.repository.codeset.ProcessingTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of processing restrictions the central system must apply.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProcessingTypeCode#Rejection
 * ProcessingTypeCode.Rejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProcessingTypeCode#CSDValidationHold
 * ProcessingTypeCode.CSDValidationHold}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProcessingTypeCode#Reservation
 * ProcessingTypeCode.Reservation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProcessingTypeCode#Blocking
 * ProcessingTypeCode.Blocking}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProcessingTypeCode#Earmarking
 * ProcessingTypeCode.Earmarking}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProcessingTypeCode#EarmarkingForAutoCollateralisation
 * ProcessingTypeCode.EarmarkingForAutoCollateralisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProcessingTypeCode#Deliverable
 * ProcessingTypeCode.Deliverable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProcessingTypeCode#Collateralised
 * ProcessingTypeCode.Collateralised}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProcessingTypeCode#CoSDBlocking
 * ProcessingTypeCode.CoSDBlocking}</li>
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
 * <li>"RJCT"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ProcessingTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the type of processing restrictions the central system must apply."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ProcessingTypeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Restriction is the rejection during the settlement instruction
	 * validation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ProcessingTypeCode
	 * ProcessingTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RJCT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rejection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Restriction is the rejection during the settlement instruction validation."
	 * </li>
	 * </ul>
	 */
	public static final ProcessingTypeCode Rejection = new ProcessingTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Rejection";
			definition = "Restriction is the rejection during the settlement instruction validation.";
			owner_lazy = () -> com.tools20022.repository.codeset.ProcessingTypeCode.mmObject();
			codeName = "RJCT";
		}
	};
	/**
	 * Restriction is setting the CSD validation automatically to hold when
	 * accepting a settlement instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ProcessingTypeCode
	 * ProcessingTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CVHD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CSDValidationHold"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Restriction is setting the CSD validation automatically to hold when accepting a settlement instruction."
	 * </li>
	 * </ul>
	 */
	public static final ProcessingTypeCode CSDValidationHold = new ProcessingTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CSDValidationHold";
			definition = "Restriction is setting the CSD validation automatically to hold when accepting a settlement instruction.";
			owner_lazy = () -> com.tools20022.repository.codeset.ProcessingTypeCode.mmObject();
			codeName = "CVHD";
		}
	};
	/**
	 * Restriction is the creation of a reservation of a cash balance or a
	 * securities position for a specific purpose.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ProcessingTypeCode
	 * ProcessingTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RSVT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reservation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Restriction is the creation of a reservation of a cash balance or a securities position for a specific purpose."
	 * </li>
	 * </ul>
	 */
	public static final ProcessingTypeCode Reservation = new ProcessingTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reservation";
			definition = "Restriction is the creation of a reservation of a cash balance or a securities position for a specific purpose.";
			owner_lazy = () -> com.tools20022.repository.codeset.ProcessingTypeCode.mmObject();
			codeName = "RSVT";
		}
	};
	/**
	 * Restriction is the blocking of a party, securities account, security or
	 * cash account from settlement, blocking of securities position or cash
	 * balance for a specific purpose.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ProcessingTypeCode
	 * ProcessingTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BLCK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Blocking"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Restriction is the blocking of a party, securities account, security or cash account from settlement, blocking of securities position or cash balance for a specific purpose."
	 * </li>
	 * </ul>
	 */
	public static final ProcessingTypeCode Blocking = new ProcessingTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Blocking";
			definition = "Restriction is the blocking of a party, securities account, security or cash account from settlement, blocking of securities position or cash balance for a specific purpose.";
			owner_lazy = () -> com.tools20022.repository.codeset.ProcessingTypeCode.mmObject();
			codeName = "BLCK";
		}
	};
	/**
	 * Restriction of linked to the balance type that defines and manages
	 * position types for securities positions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ProcessingTypeCode
	 * ProcessingTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EARM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Earmarking"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Restriction of linked to the balance type that defines and manages position types for securities positions."
	 * </li>
	 * </ul>
	 */
	public static final ProcessingTypeCode Earmarking = new ProcessingTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Earmarking";
			definition = "Restriction of linked to the balance type that defines and manages position types for securities positions.";
			owner_lazy = () -> com.tools20022.repository.codeset.ProcessingTypeCode.mmObject();
			codeName = "EARM";
		}
	};
	/**
	 * Restriction of linked to the balance type that defines and manages
	 * position types for securities positions for auto-collateralisation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ProcessingTypeCode
	 * ProcessingTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EFAC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EarmarkingForAutoCollateralisation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Restriction of linked to the balance type that defines and manages position types for securities positions for auto-collateralisation."
	 * </li>
	 * </ul>
	 */
	public static final ProcessingTypeCode EarmarkingForAutoCollateralisation = new ProcessingTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EarmarkingForAutoCollateralisation";
			definition = "Restriction of linked to the balance type that defines and manages position types for securities positions for auto-collateralisation.";
			owner_lazy = () -> com.tools20022.repository.codeset.ProcessingTypeCode.mmObject();
			codeName = "EFAC";
		}
	};
	/**
	 * No restriction has been defined.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ProcessingTypeCode
	 * ProcessingTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DLVR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Deliverable"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "No restriction has been defined."</li>
	 * </ul>
	 */
	public static final ProcessingTypeCode Deliverable = new ProcessingTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Deliverable";
			definition = "No restriction has been defined.";
			owner_lazy = () -> com.tools20022.repository.codeset.ProcessingTypeCode.mmObject();
			codeName = "DLVR";
		}
	};
	/**
	 * Restriction is linked to a sub-pledged collateral transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ProcessingTypeCode
	 * ProcessingTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "COLD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Collateralised"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Restriction is linked to a sub-pledged collateral transaction."</li>
	 * </ul>
	 */
	public static final ProcessingTypeCode Collateralised = new ProcessingTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Collateralised";
			definition = "Restriction is linked to a sub-pledged collateral transaction.";
			owner_lazy = () -> com.tools20022.repository.codeset.ProcessingTypeCode.mmObject();
			codeName = "COLD";
		}
	};
	/**
	 * Restriction does not support any partial execution.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ProcessingTypeCode
	 * ProcessingTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CSDB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoSDBlocking"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Restriction does not support any partial execution."</li>
	 * </ul>
	 */
	public static final ProcessingTypeCode CoSDBlocking = new ProcessingTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoSDBlocking";
			definition = "Restriction does not support any partial execution.";
			owner_lazy = () -> com.tools20022.repository.codeset.ProcessingTypeCode.mmObject();
			codeName = "CSDB";
		}
	};
	final static private LinkedHashMap<String, ProcessingTypeCode> codesByName = new LinkedHashMap<>();

	protected ProcessingTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("RJCT");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ProcessingTypeCode";
				definition = "Specifies the type of processing restrictions the central system must apply.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ProcessingTypeCode.Rejection, com.tools20022.repository.codeset.ProcessingTypeCode.CSDValidationHold,
						com.tools20022.repository.codeset.ProcessingTypeCode.Reservation, com.tools20022.repository.codeset.ProcessingTypeCode.Blocking, com.tools20022.repository.codeset.ProcessingTypeCode.Earmarking,
						com.tools20022.repository.codeset.ProcessingTypeCode.EarmarkingForAutoCollateralisation, com.tools20022.repository.codeset.ProcessingTypeCode.Deliverable,
						com.tools20022.repository.codeset.ProcessingTypeCode.Collateralised, com.tools20022.repository.codeset.ProcessingTypeCode.CoSDBlocking);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Rejection.getCodeName().get(), Rejection);
		codesByName.put(CSDValidationHold.getCodeName().get(), CSDValidationHold);
		codesByName.put(Reservation.getCodeName().get(), Reservation);
		codesByName.put(Blocking.getCodeName().get(), Blocking);
		codesByName.put(Earmarking.getCodeName().get(), Earmarking);
		codesByName.put(EarmarkingForAutoCollateralisation.getCodeName().get(), EarmarkingForAutoCollateralisation);
		codesByName.put(Deliverable.getCodeName().get(), Deliverable);
		codesByName.put(Collateralised.getCodeName().get(), Collateralised);
		codesByName.put(CoSDBlocking.getCodeName().get(), CoSDBlocking);
	}

	public static ProcessingTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ProcessingTypeCode[] values() {
		ProcessingTypeCode[] values = new ProcessingTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ProcessingTypeCode> {
		@Override
		public ProcessingTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ProcessingTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}