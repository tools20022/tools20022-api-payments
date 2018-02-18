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
import com.tools20022.repository.codeset.BorrowingReasonCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Identifies the underlying reason for the borrowing.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BorrowingReasonCode#SelfConsumption
 * BorrowingReasonCode.SelfConsumption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BorrowingReasonCode#TransferToThirdParty
 * BorrowingReasonCode.TransferToThirdParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BorrowingReasonCode#MarketMakingPurpose
 * BorrowingReasonCode.MarketMakingPurpose}</li>
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
 * <li>"SFCT"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "BorrowingReasonCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Identifies the underlying reason for the borrowing."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class BorrowingReasonCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * The borrowing reason is for Self consumption.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BorrowingReasonCode
	 * BorrowingReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SFCT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SelfConsumption"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The borrowing reason is for Self consumption."</li>
	 * </ul>
	 */
	public static final BorrowingReasonCode SelfConsumption = new BorrowingReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SelfConsumption";
			definition = "The borrowing reason is for Self consumption.";
			owner_lazy = () -> com.tools20022.repository.codeset.BorrowingReasonCode.mmObject();
			codeName = "SFCT";
		}
	};
	/**
	 * The borrowing reason is for Transfer to thrid party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BorrowingReasonCode
	 * BorrowingReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TTTP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferToThirdParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The borrowing reason is for Transfer to thrid party."</li>
	 * </ul>
	 */
	public static final BorrowingReasonCode TransferToThirdParty = new BorrowingReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferToThirdParty";
			definition = "The borrowing reason is for Transfer to thrid party.";
			owner_lazy = () -> com.tools20022.repository.codeset.BorrowingReasonCode.mmObject();
			codeName = "TTTP";
		}
	};
	/**
	 * The borrowing reason is for Market making purpose.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BorrowingReasonCode
	 * BorrowingReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MMPP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketMakingPurpose"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The borrowing reason is for Market making purpose."</li>
	 * </ul>
	 */
	public static final BorrowingReasonCode MarketMakingPurpose = new BorrowingReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketMakingPurpose";
			definition = "The borrowing reason is for Market making purpose.";
			owner_lazy = () -> com.tools20022.repository.codeset.BorrowingReasonCode.mmObject();
			codeName = "MMPP";
		}
	};
	final static private LinkedHashMap<String, BorrowingReasonCode> codesByName = new LinkedHashMap<>();

	protected BorrowingReasonCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("SFCT");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "BorrowingReasonCode";
				definition = "Identifies the underlying reason for the borrowing.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.BorrowingReasonCode.SelfConsumption, com.tools20022.repository.codeset.BorrowingReasonCode.TransferToThirdParty,
						com.tools20022.repository.codeset.BorrowingReasonCode.MarketMakingPurpose);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(SelfConsumption.getCodeName().get(), SelfConsumption);
		codesByName.put(TransferToThirdParty.getCodeName().get(), TransferToThirdParty);
		codesByName.put(MarketMakingPurpose.getCodeName().get(), MarketMakingPurpose);
	}

	public static BorrowingReasonCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static BorrowingReasonCode[] values() {
		BorrowingReasonCode[] values = new BorrowingReasonCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, BorrowingReasonCode> {
		@Override
		public BorrowingReasonCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(BorrowingReasonCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}