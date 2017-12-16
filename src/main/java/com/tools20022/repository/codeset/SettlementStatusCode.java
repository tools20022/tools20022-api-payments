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
import com.tools20022.repository.codeset.SettlementStatusCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the status of the settlement of a trade in a central matching and
 * settlement system.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementStatusCode#AwaitingAuthorisation
 * SettlementStatusCode.mmAwaitingAuthorisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementStatusCode#AcceptedForSettlement
 * SettlementStatusCode.mmAcceptedForSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementStatusCode#SettlementTransactionCreated
 * SettlementStatusCode.mmSettlementTransactionCreated}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementStatusCode#Rejected
 * SettlementStatusCode.mmRejected}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.SettlementStatusCode#Split
 * SettlementStatusCode.mmSplit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementStatusCode#PartiallySettled
 * SettlementStatusCode.mmPartiallySettled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementStatusCode#Settled
 * SettlementStatusCode.mmSettled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementStatusCode#AwaitingCreationConfirmation
 * SettlementStatusCode.mmAwaitingCreationConfirmation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementStatusCode#AwaitingRescindConfirmation
 * SettlementStatusCode.mmAwaitingRescindConfirmation}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"AAUT"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SettlementStatusCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the status of the settlement of a trade in a central matching and settlement system."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class SettlementStatusCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Settlement is awaiting authorisation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementStatusCode
	 * SettlementStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AAUT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AwaitingAuthorisation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Settlement is awaiting authorisation."</li>
	 * </ul>
	 */
	public static final SettlementStatusCode AwaitingAuthorisation = new SettlementStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AwaitingAuthorisation";
			definition = "Settlement is awaiting authorisation.";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementStatusCode.mmObject();
			codeName = "AAUT";
		}
	};
	/**
	 * Settlement is accepted for settlement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementStatusCode
	 * SettlementStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ASTL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcceptedForSettlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Settlement is accepted for settlement."</li>
	 * </ul>
	 */
	public static final SettlementStatusCode AcceptedForSettlement = new SettlementStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AcceptedForSettlement";
			definition = "Settlement is accepted for settlement.";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementStatusCode.mmObject();
			codeName = "ASTL";
		}
	};
	/**
	 * Settlement has been created.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementStatusCode
	 * SettlementStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "STCR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementTransactionCreated"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Settlement has been created."</li>
	 * </ul>
	 */
	public static final SettlementStatusCode SettlementTransactionCreated = new SettlementStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SettlementTransactionCreated";
			definition = "Settlement has been created.";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementStatusCode.mmObject();
			codeName = "STCR";
		}
	};
	/**
	 * Settlement is rejected.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementStatusCode
	 * SettlementStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RJCT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rejected"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Settlement is rejected."</li>
	 * </ul>
	 */
	public static final SettlementStatusCode Rejected = new SettlementStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Rejected";
			definition = "Settlement is rejected.";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementStatusCode.mmObject();
			codeName = "RJCT";
		}
	};
	/**
	 * Settlement is split.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementStatusCode
	 * SettlementStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SPLT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Split"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Settlement is split."</li>
	 * </ul>
	 */
	public static final SettlementStatusCode Split = new SettlementStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Split";
			definition = "Settlement is split.";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementStatusCode.mmObject();
			codeName = "SPLT";
		}
	};
	/**
	 * Part, but not all, of a Trade's value has settled, and no further
	 * elements of the Trade's value are expected to be settled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementStatusCode
	 * SettlementStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PSTL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartiallySettled"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Part, but not all, of a Trade's value has settled, and no further elements of the Trade's value are expected to be settled."
	 * </li>
	 * </ul>
	 */
	public static final SettlementStatusCode PartiallySettled = new SettlementStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PartiallySettled";
			definition = "Part, but not all, of a Trade's value has settled, and no further elements of the Trade's value are expected to be settled.";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementStatusCode.mmObject();
			codeName = "PSTL";
		}
	};
	/**
	 * Settlement is complete.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementStatusCode
	 * SettlementStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "STLD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Settled"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Settlement is complete."</li>
	 * </ul>
	 */
	public static final SettlementStatusCode Settled = new SettlementStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Settled";
			definition = "Settlement is complete.";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementStatusCode.mmObject();
			codeName = "STLD";
		}
	};
	/**
	 * Settlement is awaiting confirmation of creation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementStatusCode
	 * SettlementStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ACCF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AwaitingCreationConfirmation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Settlement is awaiting confirmation of creation."</li>
	 * </ul>
	 */
	public static final SettlementStatusCode AwaitingCreationConfirmation = new SettlementStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AwaitingCreationConfirmation";
			definition = "Settlement is awaiting confirmation of creation.";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementStatusCode.mmObject();
			codeName = "ACCF";
		}
	};
	/**
	 * Settlement is awaiting confirmation of rescind.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementStatusCode
	 * SettlementStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ARCF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AwaitingRescindConfirmation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Settlement is awaiting confirmation of rescind."</li>
	 * </ul>
	 */
	public static final SettlementStatusCode AwaitingRescindConfirmation = new SettlementStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AwaitingRescindConfirmation";
			definition = "Settlement is awaiting confirmation of rescind.";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementStatusCode.mmObject();
			codeName = "ARCF";
		}
	};
	final static private LinkedHashMap<String, SettlementStatusCode> codesByName = new LinkedHashMap<>();

	protected SettlementStatusCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("AAUT");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SettlementStatusCode";
				definition = "Specifies the status of the settlement of a trade in a central matching and settlement system.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SettlementStatusCode.AwaitingAuthorisation, com.tools20022.repository.codeset.SettlementStatusCode.AcceptedForSettlement,
						com.tools20022.repository.codeset.SettlementStatusCode.SettlementTransactionCreated, com.tools20022.repository.codeset.SettlementStatusCode.Rejected, com.tools20022.repository.codeset.SettlementStatusCode.Split,
						com.tools20022.repository.codeset.SettlementStatusCode.PartiallySettled, com.tools20022.repository.codeset.SettlementStatusCode.Settled,
						com.tools20022.repository.codeset.SettlementStatusCode.AwaitingCreationConfirmation, com.tools20022.repository.codeset.SettlementStatusCode.AwaitingRescindConfirmation);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(AwaitingAuthorisation.getCodeName().get(), AwaitingAuthorisation);
		codesByName.put(AcceptedForSettlement.getCodeName().get(), AcceptedForSettlement);
		codesByName.put(SettlementTransactionCreated.getCodeName().get(), SettlementTransactionCreated);
		codesByName.put(Rejected.getCodeName().get(), Rejected);
		codesByName.put(Split.getCodeName().get(), Split);
		codesByName.put(PartiallySettled.getCodeName().get(), PartiallySettled);
		codesByName.put(Settled.getCodeName().get(), Settled);
		codesByName.put(AwaitingCreationConfirmation.getCodeName().get(), AwaitingCreationConfirmation);
		codesByName.put(AwaitingRescindConfirmation.getCodeName().get(), AwaitingRescindConfirmation);
	}

	public static SettlementStatusCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static SettlementStatusCode[] values() {
		SettlementStatusCode[] values = new SettlementStatusCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, SettlementStatusCode> {
		@Override
		public SettlementStatusCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(SettlementStatusCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}