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
import com.tools20022.repository.codeset.ChargeBearerTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies which party(ies) will pay charges due for processing of the
 * instruction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChargeBearerTypeCode#BorneByDebtor
 * ChargeBearerTypeCode.mmBorneByDebtor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChargeBearerTypeCode#BorneByCreditor
 * ChargeBearerTypeCode.mmBorneByCreditor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChargeBearerTypeCode#Shared
 * ChargeBearerTypeCode.mmShared}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChargeBearerTypeCode#FollowingServiceLevel
 * ChargeBearerTypeCode.mmFollowingServiceLevel}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.ChargeBearerType1Code
 * ChargeBearerType1Code}</li>
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
 * <li>"DEBT"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ChargeBearerTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies which party(ies) will pay charges due for processing of the instruction."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ChargeBearerTypeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * All transaction charges are to be borne by the debtor.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeBearerTypeCode
	 * ChargeBearerTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DEBT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BorneByDebtor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "All transaction charges are to be borne by the debtor."</li>
	 * </ul>
	 */
	public static final ChargeBearerTypeCode BorneByDebtor = new ChargeBearerTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BorneByDebtor";
			definition = "All transaction charges are to be borne by the debtor.";
			owner_lazy = () -> com.tools20022.repository.codeset.ChargeBearerTypeCode.mmObject();
			codeName = "DEBT";
		}
	};
	/**
	 * All transaction charges are to be borne by the creditor.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeBearerTypeCode
	 * ChargeBearerTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CRED"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BorneByCreditor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "All transaction charges are to be borne by the creditor."</li>
	 * </ul>
	 */
	public static final ChargeBearerTypeCode BorneByCreditor = new ChargeBearerTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BorneByCreditor";
			definition = "All transaction charges are to be borne by the creditor.";
			owner_lazy = () -> com.tools20022.repository.codeset.ChargeBearerTypeCode.mmObject();
			codeName = "CRED";
		}
	};
	/**
	 * In a credit transfer context, means that transaction charges on the
	 * sender side are to be borne by the debtor, transaction charges on the
	 * receiver side are to be borne by the creditor. In a direct debit context,
	 * means that transaction charges on the sender side are to be borne by the
	 * creditor, transaction charges on the receiver side are to be borne by the
	 * debtor.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeBearerTypeCode
	 * ChargeBearerTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SHAR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Shared"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "In a credit transfer context, means that transaction charges on the sender side are to be borne by the debtor, transaction charges on the receiver side are to be borne by the creditor. In a direct debit context, means that transaction charges on the sender side are to be borne by the creditor, transaction charges on the receiver side are to be borne by the debtor."
	 * </li>
	 * </ul>
	 */
	public static final ChargeBearerTypeCode Shared = new ChargeBearerTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Shared";
			definition = "In a credit transfer context, means that transaction charges on the sender side are to be borne by the debtor, transaction charges on the receiver side are to be borne by the creditor. In a direct debit context, means that transaction charges on the sender side are to be borne by the creditor, transaction charges on the receiver side are to be borne by the debtor.";
			owner_lazy = () -> com.tools20022.repository.codeset.ChargeBearerTypeCode.mmObject();
			codeName = "SHAR";
		}
	};
	/**
	 * Charges are to be applied following the rules agreed in the service level
	 * and/or scheme.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeBearerTypeCode
	 * ChargeBearerTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SLEV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FollowingServiceLevel"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Charges are to be applied following the rules agreed in the service level and/or scheme."
	 * </li>
	 * </ul>
	 */
	public static final ChargeBearerTypeCode FollowingServiceLevel = new ChargeBearerTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FollowingServiceLevel";
			definition = "Charges are to be applied following the rules agreed in the service level and/or scheme.";
			owner_lazy = () -> com.tools20022.repository.codeset.ChargeBearerTypeCode.mmObject();
			codeName = "SLEV";
		}
	};
	final static private LinkedHashMap<String, ChargeBearerTypeCode> codesByName = new LinkedHashMap<>();

	protected ChargeBearerTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("DEBT");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ChargeBearerTypeCode";
				definition = "Specifies which party(ies) will pay charges due for processing of the instruction.";
				derivation_lazy = () -> Arrays.asList(ChargeBearerType1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ChargeBearerTypeCode.BorneByDebtor, com.tools20022.repository.codeset.ChargeBearerTypeCode.BorneByCreditor,
						com.tools20022.repository.codeset.ChargeBearerTypeCode.Shared, com.tools20022.repository.codeset.ChargeBearerTypeCode.FollowingServiceLevel);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(BorneByDebtor.getCodeName().get(), BorneByDebtor);
		codesByName.put(BorneByCreditor.getCodeName().get(), BorneByCreditor);
		codesByName.put(Shared.getCodeName().get(), Shared);
		codesByName.put(FollowingServiceLevel.getCodeName().get(), FollowingServiceLevel);
	}

	public static ChargeBearerTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ChargeBearerTypeCode[] values() {
		ChargeBearerTypeCode[] values = new ChargeBearerTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ChargeBearerTypeCode> {
		@Override
		public ChargeBearerTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ChargeBearerTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}