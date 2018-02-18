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
import com.tools20022.repository.codeset.HoldingTransferableCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Indicate whether or not registered investors are able to transfer some or all
 * of their holdings to third parties.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.HoldingTransferableCode#TransferAllowed
 * HoldingTransferableCode.TransferAllowed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.HoldingTransferableCode#TransferNotAllowed
 * HoldingTransferableCode.TransferNotAllowed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.HoldingTransferableCode#ReferToFundOrderDesk
 * HoldingTransferableCode.ReferToFundOrderDesk}</li>
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
 * <li>"TRAL"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "HoldingTransferableCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Indicate whether or not registered investors are able to transfer some or all of their holdings to third parties."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class HoldingTransferableCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Transfer is allowed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.HoldingTransferableCode
	 * HoldingTransferableCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TRAL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferAllowed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transfer is allowed."</li>
	 * </ul>
	 */
	public static final HoldingTransferableCode TransferAllowed = new HoldingTransferableCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TransferAllowed";
			definition = "Transfer is allowed.";
			owner_lazy = () -> com.tools20022.repository.codeset.HoldingTransferableCode.mmObject();
			codeName = "TRAL";
		}
	};
	/**
	 * Transfer is not allowed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.HoldingTransferableCode
	 * HoldingTransferableCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TRNA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferNotAllowed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transfer is not allowed."</li>
	 * </ul>
	 */
	public static final HoldingTransferableCode TransferNotAllowed = new HoldingTransferableCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TransferNotAllowed";
			definition = "Transfer is not allowed.";
			owner_lazy = () -> com.tools20022.repository.codeset.HoldingTransferableCode.mmObject();
			codeName = "TRNA";
		}
	};
	/**
	 * Indicates that the operation is only possible in restricted
	 * circumstances.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.HoldingTransferableCode
	 * HoldingTransferableCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RFOD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReferToFundOrderDesk"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that the operation is only possible in restricted circumstances."
	 * </li>
	 * </ul>
	 */
	public static final HoldingTransferableCode ReferToFundOrderDesk = new HoldingTransferableCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ReferToFundOrderDesk";
			definition = "Indicates that the operation is only possible in restricted circumstances.";
			owner_lazy = () -> com.tools20022.repository.codeset.HoldingTransferableCode.mmObject();
			codeName = "RFOD";
		}
	};
	final static private LinkedHashMap<String, HoldingTransferableCode> codesByName = new LinkedHashMap<>();

	protected HoldingTransferableCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("TRAL");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "HoldingTransferableCode";
				definition = "Indicate whether or not registered investors are able to transfer some or all of their holdings to third parties.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.HoldingTransferableCode.TransferAllowed, com.tools20022.repository.codeset.HoldingTransferableCode.TransferNotAllowed,
						com.tools20022.repository.codeset.HoldingTransferableCode.ReferToFundOrderDesk);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(TransferAllowed.getCodeName().get(), TransferAllowed);
		codesByName.put(TransferNotAllowed.getCodeName().get(), TransferNotAllowed);
		codesByName.put(ReferToFundOrderDesk.getCodeName().get(), ReferToFundOrderDesk);
	}

	public static HoldingTransferableCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static HoldingTransferableCode[] values() {
		HoldingTransferableCode[] values = new HoldingTransferableCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, HoldingTransferableCode> {
		@Override
		public HoldingTransferableCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(HoldingTransferableCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}