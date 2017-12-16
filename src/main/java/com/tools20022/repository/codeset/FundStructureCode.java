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
import com.tools20022.repository.codeset.FundStructureCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the structure of the fund.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FundStructureCode#MultiClassFund
 * FundStructureCode.mmMultiClassFund}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FundStructureCode#SingleClassFund
 * FundStructureCode.mmSingleClassFund}</li>
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
 * <li>"MFUN"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "FundStructureCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the structure of the fund."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class FundStructureCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Investment fund that contains more than one investment fund class.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FundStructureCode
	 * FundStructureCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MFUN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MultiClassFund"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Investment fund that contains more than one investment fund class."</li>
	 * </ul>
	 */
	public static final FundStructureCode MultiClassFund = new FundStructureCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MultiClassFund";
			definition = "Investment fund that contains more than one investment fund class.";
			owner_lazy = () -> com.tools20022.repository.codeset.FundStructureCode.mmObject();
			codeName = "MFUN";
		}
	};
	/**
	 * Investment fund that contains only one investment fund class.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FundStructureCode
	 * FundStructureCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SFUN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SingleClassFund"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Investment fund that contains only one investment fund class."</li>
	 * </ul>
	 */
	public static final FundStructureCode SingleClassFund = new FundStructureCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SingleClassFund";
			definition = "Investment fund that contains only one investment fund class.";
			owner_lazy = () -> com.tools20022.repository.codeset.FundStructureCode.mmObject();
			codeName = "SFUN";
		}
	};
	final static private LinkedHashMap<String, FundStructureCode> codesByName = new LinkedHashMap<>();

	protected FundStructureCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("MFUN");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FundStructureCode";
				definition = "Specifies the structure of the fund.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.FundStructureCode.MultiClassFund, com.tools20022.repository.codeset.FundStructureCode.SingleClassFund);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(MultiClassFund.getCodeName().get(), MultiClassFund);
		codesByName.put(SingleClassFund.getCodeName().get(), SingleClassFund);
	}

	public static FundStructureCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static FundStructureCode[] values() {
		FundStructureCode[] values = new FundStructureCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, FundStructureCode> {
		@Override
		public FundStructureCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(FundStructureCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}